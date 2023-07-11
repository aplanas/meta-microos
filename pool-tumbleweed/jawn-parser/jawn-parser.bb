SUMMARY = "A generic JSON parser"
DESCRIPTION = "Jawn is a JSON parser that was designed to parse \
JSON into an AST as quickly as possible. \
 \
This package contains a generic JSON parser."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "jawn-parser-0.14.1-2.11.noarch.rpm"
RPM_HASH = "8ace6d9746992a6d3367e728f2e5f8f8d06df5a13c7ae6528a8077f11147e0aa9c5820047ec61ada3675538c88e447d2c2c26827b78a0f44c9ef07c82c9a6b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jawn-parser \
mvn-org.spire-math-jawn-parser-2.10 \
mvn-org.spire-math-jawn-parser-2.10-pom- \
mvn-org.typelevel-jawn-parser-2.10 \
mvn-org.typelevel-jawn-parser-2.10-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library"

inherit rpm
