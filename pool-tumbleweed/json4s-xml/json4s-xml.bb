SUMMARY = "The json4s xml module"
DESCRIPTION = "Json4s is a common AST for Scala JSON parsers. \
 \
This package contains the xml module."
LICENSE = "Apache-2.0"

PV = "3.6.7"

RPM_NAME = "json4s-xml-3.6.7-1.16.noarch.rpm"
RPM_HASH = "4c139140d803f964cc0602c343e8790a9453740378089e25d64793366594028522cf36c4c9c65b06efaf3c4b48d56850459916feebb88408a8e71d47e8d4b846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json4s-xml \
mvn-org.json4s-json4s-xml-2.10 \
mvn-org.json4s-json4s-xml-2.10-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.json4s-json4s-core-2.10 \
mvn-org.scala-lang-scala-library"

inherit rpm
