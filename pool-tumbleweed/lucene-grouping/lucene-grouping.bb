SUMMARY = "Grouping module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'grouping' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-grouping-8.5.0-5.1.noarch.rpm"
RPM_HASH = "bba399972a0f35cd5144b12961d858286084bfdea968958dc1bddebaee8b25f093f7b33dcb53f04d41d0ba4a118ac55a006652657a14e57722aa7618bffd4a0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-grouping \
mvn-org.apache.lucene-lucene-grouping \
mvn-org.apache.lucene-lucene-grouping-pom- \
osgi-org.apache.lucene.grouping"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-queries"

inherit rpm
