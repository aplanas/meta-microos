SUMMARY = "Grouping module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'grouping' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-grouping-8.5.0-4.1.noarch.rpm"
RPM_HASH = "8fc0e678b5c21ca75b0df90e537d954f60df94817789003a7cd8b76148b9dd1bf91f3ac791362e1f825149f6fc5da5eb44c077af952ff3e21fcd22c35f53c218"
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
