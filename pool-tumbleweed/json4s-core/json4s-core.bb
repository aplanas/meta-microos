SUMMARY = "The json4s core module"
DESCRIPTION = "Json4s is a common AST for Scala JSON parsers. \
 \
This package contains the core module."
LICENSE = "Apache-2.0"

PV = "3.6.7"

RPM_NAME = "json4s-core-3.6.7-1.17.noarch.rpm"
RPM_HASH = "af57e51d7b76e93152b5dcd3c0abeea7a2f57313c95a12188cc9d1776fec12530cac28c17969459b40cf52cc15072ee3f66d8a4633bf59ee0e76b8e211aa5202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json4s-core \
mvn-org.json4s-json4s-core-2.10 \
mvn-org.json4s-json4s-core-2.10-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.paranamer-paranamer \
mvn-org.json4s-json4s-ast-2.10 \
mvn-org.json4s-json4s-scalap-2.10 \
mvn-org.scala-lang-scala-library"

inherit rpm
