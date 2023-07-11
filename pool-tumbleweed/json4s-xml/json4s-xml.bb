SUMMARY = "The json4s xml module"
DESCRIPTION = "Json4s is a common AST for Scala JSON parsers. \
 \
This package contains the xml module."
LICENSE = "Apache-2.0"

PV = "3.6.7"

RPM_NAME = "json4s-xml-3.6.7-1.17.noarch.rpm"
RPM_HASH = "fa7fc0f90ac308f7b0219d0ceace0ad46b11826f7444f0e8a5f3aeddc92088ba096b01b11813f51f5dd4214906fa9558d32a18da241e2b86eab7e7a00a7b5a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json4s-xml \
mvn-org.json4s-json4s-xml-2.10 \
mvn-org.json4s-json4s-xml-2.10-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.json4s-json4s-core-2.10 \
mvn-org.scala-lang-scala-library"

inherit rpm
