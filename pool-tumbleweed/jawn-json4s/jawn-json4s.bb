SUMMARY = "Support to parse to json4s AST"
DESCRIPTION = "Jawn is a JSON parser that was designed to parse \
JSON into an AST as quickly as possible. \
 \
This package contains support to parse to json4s AST."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "jawn-json4s-0.14.1-2.11.noarch.rpm"
RPM_HASH = "6827ca05d9ac6be5f4cb38d583cb084c6d13fb0126d57e0454ab401b1fc5c9939b72e4e4b837fcfe9cb43deb898df32999d84732ee7500da454318342c3d25ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jawn-json4s \
mvn-org.spire-math-jawn-json4s-2.10 \
mvn-org.spire-math-jawn-json4s-2.10-pom- \
mvn-org.spire-math-json4s-support-2.10 \
mvn-org.spire-math-json4s-support-2.10-pom- \
mvn-org.typelevel-jawn-json4s-2.10 \
mvn-org.typelevel-jawn-json4s-2.10-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.json4s-json4s-ast-2.10 \
mvn-org.scala-lang-scala-library \
mvn-org.typelevel-jawn-parser-2.10 \
mvn-org.typelevel-jawn-util-2.10"

inherit rpm
