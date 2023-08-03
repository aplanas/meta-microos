SUMMARY = "Queryparser module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'queryparser' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-queryparser-8.5.0-4.1.noarch.rpm"
RPM_HASH = "f9201c02aaf9b684e657e456dbc2ad99e851cb60698c58cf46d1aa994a78ecc5de5f2cd451a7147d03483c989aa38dc212291fcc37d2c01cd8d6828f6dc2b9de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-queryparser \
mvn-org.apache.lucene-lucene-queryparser \
mvn-org.apache.lucene-lucene-queryparser-pom- \
osgi-org.apache.lucene.queryparser"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-queries \
mvn-org.apache.lucene-lucene-sandbox"

inherit rpm
