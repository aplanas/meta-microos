SUMMARY = "The json4s jackson module"
DESCRIPTION = "Json4s is a common AST for Scala JSON parsers. \
 \
This package contains the jackson module."
LICENSE = "Apache-2.0"

PV = "3.6.7"

RPM_NAME = "json4s-jackson-3.6.7-1.17.noarch.rpm"
RPM_HASH = "e37fae9b24fc3845566c631169c70fc022805a52c4e616ec2ff8ab8e8c4abe770ea0ddd207392ab84340ccca5c08b1eaf43ff259a06557047a80203764d64d7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json4s-jackson \
mvn-org.json4s-json4s-jackson-2.10 \
mvn-org.json4s-json4s-jackson-2.10-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-org.json4s-json4s-core-2.10 \
mvn-org.scala-lang-scala-library"

inherit rpm
