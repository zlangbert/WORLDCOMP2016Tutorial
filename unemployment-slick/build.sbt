name := """unemployment-slick"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"

val buildSettings = Defaults.defaultSettings ++ Seq(
  javaOptions += "-Xmx8G"
)

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "mysql" % "mysql-connector-java" % "5.1.34",
  "com.typesafe.play" %% "play-slick" % "2.0.0",
  "com.typesafe.slick" %% "slick-codegen" % "3.1.1"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
