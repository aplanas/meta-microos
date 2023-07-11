SUMMARY = "A few helpful utilities"
DESCRIPTION = "Jawn is a JSON parser that was designed to parse \
JSON into an AST as quickly as possible. \
 \
This package contains a few helpful utilities."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "jawn-util-0.14.1-2.11.noarch.rpm"
RPM_HASH = "6db3c59d4b723591698edf3fa7cadde95a5722a34e840ecb9ad24febd109f4a38c5251f877d3078336b407fac3da89b53d2faf87b1acd4776001c0abfc111406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jawn-util \
mvn-org.spire-math-jawn-util-2.10 \
mvn-org.spire-math-jawn-util-2.10-pom- \
mvn-org.typelevel-jawn-util-2.10 \
mvn-org.typelevel-jawn-util-2.10-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library \
mvn-org.typelevel-jawn-parser-2.10"

inherit rpm
