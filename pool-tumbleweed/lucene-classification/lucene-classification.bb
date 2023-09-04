SUMMARY = "Classification module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'classification' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-classification-8.5.0-5.1.noarch.rpm"
RPM_HASH = "bdba297c63467a08e2f2a0aa565ab7d5b744b87665278b0e5df6916185fd6f28b9ff2e81b0f34bb0249c3200167264379ef1f6dd27cc5778da77ab6b145af018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-classification \
mvn-org.apache.lucene-lucene-classification \
mvn-org.apache.lucene-lucene-classification-pom- \
osgi-org.apache.lucene.classification"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-grouping \
mvn-org.apache.lucene-lucene-queries"

inherit rpm
