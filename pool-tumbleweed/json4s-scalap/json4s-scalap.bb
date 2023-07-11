SUMMARY = "The json4s scalap module"
DESCRIPTION = "Json4s is a common AST for Scala JSON parsers. \
 \
This package contains the scalap module."
LICENSE = "Apache-2.0"

PV = "3.6.7"

RPM_NAME = "json4s-scalap-3.6.7-1.17.noarch.rpm"
RPM_HASH = "03a126f8b1d18ea178020c091ca674baa7107a6da984b37d878200298fe724ba175e962131f3497b28c9f497d9f2aab918c769c7a5adc6d997d8043f715147bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json4s-scalap \
mvn-org.json4s-json4s-scalap-2.10 \
mvn-org.json4s-json4s-scalap-2.10-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library"

inherit rpm
