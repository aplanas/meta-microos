SUMMARY = "Queries module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'queries' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-queries-8.5.0-4.1.noarch.rpm"
RPM_HASH = "097f87dbc1478627d2f31b0008329c46bb690e85baa488d6e29886d2ee6902918b0ae85620d3ae4bc7fa93b3c5550b6a0522e0fd652aefb58411ba53b9a0b921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-queries \
mvn-org.apache.lucene-lucene-queries \
mvn-org.apache.lucene-lucene-queries-pom- \
osgi-org.apache.lucene.queries"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
