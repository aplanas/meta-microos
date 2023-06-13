SUMMARY = "The json4s jackson module"
DESCRIPTION = "Json4s is a common AST for Scala JSON parsers. \
 \
This package contains the jackson module."
LICENSE = "Apache-2.0"

PV = "3.6.7"

RPM_NAME = "json4s-jackson-3.6.7-1.16.noarch.rpm"
RPM_HASH = "5b434be2ee8af64d415dbfcff1b461bfe8cae4eb675ae193a2580374b007033e27e7139100ca8ebfe14ede216d57976187df00c4443bcf0786a7fa7a989bcd8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json4s-jackson \
mvn(org.json4s:json4s-jackson_2.10) \
mvn(org.json4s:json4s-jackson_2.10:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-databind) \
mvn(org.json4s:json4s-core_2.10) \
mvn(org.scala-lang:scala-library)"

inherit rpm
