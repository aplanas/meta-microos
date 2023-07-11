SUMMARY = "A small AST"
DESCRIPTION = "Jawn is a JSON parser that was designed to parse \
JSON into an AST as quickly as possible. \
 \
This package contains a amall AST."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "jawn-ast-0.14.1-2.11.noarch.rpm"
RPM_HASH = "2c6eaf9c03910d8787e34610109d7a6cbc35e7c9db7d77d2f4077100f17f276a5bc80eb530c19cfb51c6ee45cde2a2777ca92083f7f3bcc7f96ea782c27fe7a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jawn-ast \
mvn-org.spire-math-jawn-ast-2.10 \
mvn-org.spire-math-jawn-ast-2.10-pom- \
mvn-org.typelevel-jawn-ast-2.10 \
mvn-org.typelevel-jawn-ast-2.10-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library \
mvn-org.typelevel-jawn-parser-2.10 \
mvn-org.typelevel-jawn-util-2.10"

inherit rpm
