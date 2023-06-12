SUMMARY = "The json4s ast module"
DESCRIPTION = "Json4s is a common AST for Scala JSON parsers. \
 \
This package contains the ast module."
LICENSE = "Apache-2.0"

PV = "3.6.7"

RPM_NAME = "json4s-ast-3.6.7-1.16.noarch.rpm"
RPM_HASH = "af5ff4c1ee59ee6e2952c06020ab06b3de6c64e356345b2a413b8e1f7920cfa71dcbf07319ecc8d35bec24acc45fa2dc1c9dbe40a49ff8d51b9b2aed306ba271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json4s-ast \
mvn(org.json4s:json4s-ast_2.10) \
mvn(org.json4s:json4s-ast_2.10:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.scala-lang:scala-library)"

inherit rpm
