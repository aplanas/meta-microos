SUMMARY = "Analyzers-stempel module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-stempel' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-analyzers-stempel-8.5.0-5.1.noarch.rpm"
RPM_HASH = "d4b94fb8dfc3c8948ff5ccb71db3e90ca831d34108eac721e5bcc1224b3a36001e906cb624576bf240dfac8e08e478bbb06fb5052070fdbca2abfb47bc25c38e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-analyzers-stempel \
mvn-org.apache.lucene-lucene-analyzers-stempel \
mvn-org.apache.lucene-lucene-analyzers-stempel-pom- \
osgi-org.apache.lucene.analyzers-stempel"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core"

inherit rpm
