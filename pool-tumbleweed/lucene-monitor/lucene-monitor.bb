SUMMARY = "Spatial module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'monitor' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-monitor-8.5.0-3.4.noarch.rpm"
RPM_HASH = "7685970a70e058cbae1048eb20a80c61064f16f245d927b7f2c35ffc998b1c56933d2e88941eeaf5f2229aaf70d8b55035918766c2355fe59837cd5c49aee5ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-monitor \
mvn(org.apache.lucene:lucene-monitor) \
mvn(org.apache.lucene:lucene-monitor:pom:) \
osgi(org.apache.lucene.monitor)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.lucene:lucene-analyzers-common) \
mvn(org.apache.lucene:lucene-core) \
mvn(org.apache.lucene:lucene-memory) \
mvn(org.apache.lucene:lucene-queryparser)"

inherit rpm
