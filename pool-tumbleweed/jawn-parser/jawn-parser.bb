SUMMARY = "A generic JSON parser"
DESCRIPTION = "Jawn is a JSON parser that was designed to parse \
JSON into an AST as quickly as possible. \
 \
This package contains a generic JSON parser."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "jawn-parser-0.14.1-2.10.noarch.rpm"
RPM_HASH = "dd6fd708b326c53d201237f2df23819dc8c1ba6a5ec1426971ff9c03f4a799568683dc94398f99f4673c78d575cbe833ee5d0c00efa45d8dd100d632267cfe27"
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
