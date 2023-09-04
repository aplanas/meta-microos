SUMMARY = "Misc module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'misc' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-misc-8.5.0-5.1.aarch64.rpm"
RPM_HASH = "3550c1782b93bfe2c58ff59f581be5657c5a5b65990d4c94b20c2052e9ca09a2719925d2b6433a5e9682e50ef02ffa13fb97c2fd53fbf981735adfa5873d4077"

RPROVIDES:${PN} += "lucene-misc \
mvn-org.apache.lucene-lucene-misc \
mvn-org.apache.lucene-lucene-misc-pom- \
osgi-org.apache.lucene.misc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core \
osgi-org.apache.lucene.core"

inherit rpm
