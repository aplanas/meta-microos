SUMMARY = "The json4s ast module"
DESCRIPTION = "Json4s is a common AST for Scala JSON parsers. \
 \
This package contains the ast module."
LICENSE = "Apache-2.0"

PV = "3.6.7"

RPM_NAME = "json4s-ast-3.6.7-1.17.noarch.rpm"
RPM_HASH = "df5a0e361c76994f2e7c78bc341f6442402156cf1fb2a336e4d2465a633ebd556c5c16b57f2382d078117705bc87509831b917ac42c5aff7b1b5e23473376218"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json4s-ast \
mvn-org.json4s-json4s-ast-2.10 \
mvn-org.json4s-json4s-ast-2.10-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.scala-lang-scala-library"

inherit rpm
