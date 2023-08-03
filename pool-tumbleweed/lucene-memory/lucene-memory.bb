SUMMARY = "Memory module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'memory' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-memory-8.5.0-4.1.noarch.rpm"
RPM_HASH = "72f4f4b34aac769194a56caf7a6383ac6ad21d1fbf5ceab7245ef676c806d81028a0bd481e406ffb503f09ab50fdd5464988e7932fad0905c5909cc33e314770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-memory \
mvn-org.apache.lucene-lucene-memory \
mvn-org.apache.lucene-lucene-memory-pom- \
osgi-org.apache.lucene.memory"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
