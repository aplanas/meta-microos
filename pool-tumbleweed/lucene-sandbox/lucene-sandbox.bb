SUMMARY = "Sandbox module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'sandbox' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-sandbox-8.5.0-5.1.noarch.rpm"
RPM_HASH = "982cc623b1f7917d7e173e13f41cb68e04858c062fd380b6ce0f5eba46408e2cd7123de64ca208a508b5e8b8c4596bb487f8b0ecf5cc4ba702d00325d3d9556a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-sandbox \
mvn-org.apache.lucene-lucene-sandbox \
mvn-org.apache.lucene-lucene-sandbox-pom- \
osgi-org.apache.lucene.sandbox"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
