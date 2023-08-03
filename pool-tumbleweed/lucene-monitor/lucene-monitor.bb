SUMMARY = "Spatial module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'monitor' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-monitor-8.5.0-4.1.noarch.rpm"
RPM_HASH = "715809ecb535e45db6c280789e49e5088306ff2c1796d668a4ef0f3520ec1bed4f462c3e30f812b5163f17c94b31100b6b86c8d4a1be862dcdf4003fb93f8483"
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
