SUMMARY = "Launcher Interface"
DESCRIPTION = "Interfaces for launching projects with the sbt launcher"
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "sbt-launcher-interface-1.1.2-2.9.noarch.rpm"
RPM_HASH = "f6cd180416a3274f1d4920377ea664f0120e48e1a6c1cb94f13165ef5aaaa0bf8850146208608f104f83a20584afd431bbdf9c793c4bbdde882349ec81f2b7a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.scala-sbt:launcher-interface) \
mvn(org.scala-sbt:launcher-interface:pom:) \
sbt-launcher-interface"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
