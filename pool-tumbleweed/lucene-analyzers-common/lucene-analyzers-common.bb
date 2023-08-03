SUMMARY = "Analyzers-common module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-common' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-analyzers-common-8.5.0-4.1.noarch.rpm"
RPM_HASH = "8cbaa3504535dac3458e1304efb7de117a8281d7d7853cdb38cbdaba659ea9bf305b184d955470ebb6567dc33af31d3d7cf7c89008d21cdae780a22b4de90426"
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
