SUMMARY = "Spatial module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'monitor' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-monitor-8.5.0-3.5.noarch.rpm"
RPM_HASH = "57f97fa9ad5d72ecc859c58b681d7b14c5caa731e6114aacd31742d390471b16cc3eb17a37dfd75805915ba60fe96dd0d7b2d16fb00ec01e24dab0335bee5d5c"
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
