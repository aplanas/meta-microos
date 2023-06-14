SUMMARY = "Analyzers-stempel module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-stempel' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-analyzers-stempel-8.5.0-3.4.noarch.rpm"
RPM_HASH = "7c9b328c5e1ae85239ef27849ef9120686523ed0f9d8bdf63506e1198a91e46a5555f751f2d6c32e7372afe7c9dd63824f9b13d4f538379c923475d1a800dea3"
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
