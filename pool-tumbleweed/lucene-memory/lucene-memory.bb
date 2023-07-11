SUMMARY = "Memory module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'memory' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-memory-8.5.0-3.5.noarch.rpm"
RPM_HASH = "295ad41299b506eaa4a110c0a7c574261b92ba9954a51c33c76142adc5b240002a37aee2a2fd6b84c1de233c5d99cbe92f7628cbb64d56ae7009f9b60b5691b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-memory \
mvn-org.apache.lucene-lucene-memory \
mvn-org.apache.lucene-lucene-memory-pom- \
osgi-org.apache.lucene.memory"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
