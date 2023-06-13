SUMMARY = "A small AST"
DESCRIPTION = "Jawn is a JSON parser that was designed to parse \
JSON into an AST as quickly as possible. \
 \
This package contains a amall AST."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "jawn-ast-0.14.1-2.10.noarch.rpm"
RPM_HASH = "f1f5e8d610e2c4cbeeefc37b517dbc2a0c48f2407d8ae0e712d9f0387eb78f0629ca3bda06d09d101ce6b3b776af15a05e549e425ab6f0fb52b921da23f336a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jawn-ast \
mvn(org.spire-math:jawn-ast_2.10) \
mvn(org.spire-math:jawn-ast_2.10:pom:) \
mvn(org.typelevel:jawn-ast_2.10) \
mvn(org.typelevel:jawn-ast_2.10:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.scala-lang:scala-library) \
mvn(org.typelevel:jawn-parser_2.10) \
mvn(org.typelevel:jawn-util_2.10)"

inherit rpm
