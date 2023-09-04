SUMMARY = "Spatial module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'monitor' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-monitor-8.5.0-5.1.noarch.rpm"
RPM_HASH = "83e91260ec7996784457f8ab7201899021e349845ea0c55aa9b862ae083e3fd849ddd6f43f61540818b4c45134faa6f9ab7f2a6cc6ba66094b6c2ab2dbffe70c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-monitor \
mvn-org.apache.lucene-lucene-monitor \
mvn-org.apache.lucene-lucene-monitor-pom- \
osgi-org.apache.lucene.monitor"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-memory \
mvn-org.apache.lucene-lucene-queryparser"

inherit rpm
