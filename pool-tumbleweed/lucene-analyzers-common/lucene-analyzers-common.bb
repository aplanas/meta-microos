SUMMARY = "Analyzers-common module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-common' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-analyzers-common-8.5.0-3.4.noarch.rpm"
RPM_HASH = "70784e4ccc8eab4fc8a59694ac09a6e4a6bb02e7c87e951b19dee885d6a7bb695d71bf49da70d6e21f7b921e8a7617f0e1e80f8d32bc166321f919ff51f3b6a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-analysis \
lucene-analyzers-common \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-analyzers-common-pom- \
osgi-org.apache.lucene.analyzers-common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core \
osgi-org.apache.lucene.core"

inherit rpm
