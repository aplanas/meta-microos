SUMMARY = "The json4s core module"
DESCRIPTION = "Json4s is a common AST for Scala JSON parsers. \
 \
This package contains the core module."
LICENSE = "Apache-2.0"

PV = "3.6.7"

RPM_NAME = "json4s-core-3.6.7-1.16.noarch.rpm"
RPM_HASH = "74c459b9b54cca50f568c9490295027036604beca5ce7663f5a67fc8cb6edf4f689b74f85d3f5879972c83db4a09948297b9a265ac2f317d1445847411a59a81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json4s-core \
mvn(org.json4s:json4s-core_2.10) \
mvn(org.json4s:json4s-core_2.10:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.thoughtworks.paranamer:paranamer) \
mvn(org.json4s:json4s-ast_2.10) \
mvn(org.json4s:json4s-scalap_2.10) \
mvn(org.scala-lang:scala-library)"

inherit rpm
