SUMMARY = "The json4s native module"
DESCRIPTION = "Json4s is a common AST for Scala JSON parsers. \
 \
This package contains the native module."
LICENSE = "Apache-2.0"

PV = "3.6.7"

RPM_NAME = "json4s-native-3.6.7-1.16.noarch.rpm"
RPM_HASH = "cbb6ecb499f748f189f291a26383da00e7e03c0dbb6b1fad55254e7a516f7f567db01b45fa20dc85af822ec2e6a2de9e970440eff83ff7812f8356561c184ec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json4s-native \
mvn-org.json4s-json4s-native-2.10 \
mvn-org.json4s-json4s-native-2.10-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.json4s-json4s-core-2.10 \
mvn-org.scala-lang-scala-library"

inherit rpm
