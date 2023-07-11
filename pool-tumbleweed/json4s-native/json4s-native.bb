SUMMARY = "The json4s native module"
DESCRIPTION = "Json4s is a common AST for Scala JSON parsers. \
 \
This package contains the native module."
LICENSE = "Apache-2.0"

PV = "3.6.7"

RPM_NAME = "json4s-native-3.6.7-1.17.noarch.rpm"
RPM_HASH = "fcd4e9858ae0e6beabbe98cb311bbed8e20ce1c891262c8218fbb3d3b6762c1f844d26bccf8c8b9503bd69b1bd98a72c128485b88d5b6e00b5049c3230d8d748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json4s-native \
mvn-org.json4s-json4s-native-2.10 \
mvn-org.json4s-json4s-native-2.10-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.json4s-json4s-core-2.10 \
mvn-org.scala-lang-scala-library"

inherit rpm
