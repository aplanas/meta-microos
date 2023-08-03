SUMMARY = "Classification module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'classification' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-classification-8.5.0-4.1.noarch.rpm"
RPM_HASH = "9f0968c31d82ab65f3f4dbb52c488c12ece524e97563bd3dc0550556ce90a04e4c2464258d8927fd32f099800b7c8022df81336765a65f22be03e9e4d9a5d4e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-classification \
mvn-org.apache.lucene-lucene-classification \
mvn-org.apache.lucene-lucene-classification-pom- \
osgi-org.apache.lucene.classification"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-grouping \
mvn-org.apache.lucene-lucene-queries"

inherit rpm
