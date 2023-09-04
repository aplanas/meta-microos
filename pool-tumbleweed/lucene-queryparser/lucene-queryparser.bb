SUMMARY = "Queryparser module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'queryparser' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-queryparser-8.5.0-5.1.noarch.rpm"
RPM_HASH = "315e9c09af84109137050064305ebc7e4032ac4da1d8e8738cf600c9bd3023daec0f9caccd9a6027d371713a1d35e5758b24a19687b12b3a4ad84ce5f126d647"
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
