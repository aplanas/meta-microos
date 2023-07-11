SUMMARY = "Analyzers-smartcn module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-smartcn' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-analyzers-smartcn-8.5.0-3.5.noarch.rpm"
RPM_HASH = "198ba9564cbe86d9e2e2b1edac5097dd2905ca6424aa9c6e2a2446e902f6d47e2d7a1f4bb74dcd2db4610237325a1f444ae9ff8fcb96aa3127955e35a2ef5b15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-analyzers-smartcn \
mvn-org.apache.lucene-lucene-analyzers-smartcn \
mvn-org.apache.lucene-lucene-analyzers-smartcn-pom- \
osgi-org.apache.lucene.analyzers-smartcn"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core"

inherit rpm
