SUMMARY = "Analyzers-common module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-common' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-analyzers-common-8.5.0-5.1.noarch.rpm"
RPM_HASH = "fcc10a142244ef99173bc7cc5c2f58e8ea980d27e7fda7fdf921bf09618d157dd4d847c2f2a03c7a285e62f26fb2719a8d144533035a292fb3c308c052d6392a"
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
