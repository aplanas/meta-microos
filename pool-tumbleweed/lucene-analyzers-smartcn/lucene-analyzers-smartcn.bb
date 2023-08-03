SUMMARY = "Analyzers-smartcn module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-smartcn' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-analyzers-smartcn-8.5.0-4.1.noarch.rpm"
RPM_HASH = "786788b0a59921bf6212e7d941741431ada5eea5de20e62d56eb7132d580476e3df8d110c3d61cbead9e970f54529d2a2d29641d1755e5e4c52d839500dc3a9d"
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
