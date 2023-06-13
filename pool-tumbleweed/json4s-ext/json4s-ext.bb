SUMMARY = "The json4s ext module"
DESCRIPTION = "Json4s is a common AST for Scala JSON parsers. \
 \
This package contains the ext module."
LICENSE = "Apache-2.0"

PV = "3.6.7"

RPM_NAME = "json4s-ext-3.6.7-1.16.noarch.rpm"
RPM_HASH = "7891d5805a7f9704b82c7a0caf40f662a67ff4f871c6ea7bd77b7563fcd186869d333f9cf5c797452e30502b0c9203ce5d99d174b97c7b5d0c637b2abe1bce29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json4s-ext \
mvn(org.json4s:json4s-ext_2.10) \
mvn(org.json4s:json4s-ext_2.10:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(joda-time:joda-time) \
mvn(org.joda:joda-convert) \
mvn(org.scala-lang:scala-library)"

inherit rpm
