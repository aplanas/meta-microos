SUMMARY = "Analyzers-stempel module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-stempel' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-analyzers-stempel-8.5.0-3.5.noarch.rpm"
RPM_HASH = "187f17883e85c90bf06197d68d3e04c1d12a3712b2c334c3e8a5dff656bec6339fda755203d3660e52b1e3630734a00852fdbcd1b0a03ee75de56dbfed7a0168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-analyzers-stempel \
mvn-org.apache.lucene-lucene-analyzers-stempel \
mvn-org.apache.lucene-lucene-analyzers-stempel-pom- \
osgi-org.apache.lucene.analyzers-stempel"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core"

inherit rpm
