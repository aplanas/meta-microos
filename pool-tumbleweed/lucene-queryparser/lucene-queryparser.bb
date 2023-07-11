SUMMARY = "Queryparser module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'queryparser' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-queryparser-8.5.0-3.5.noarch.rpm"
RPM_HASH = "ccb5466cf40c7f3d34605bc8feee720ee89fffa060b7c22ac52d39976320c7ea891bc1b58499b46dd89f7bb38ba38a2782d6de89dbaf221df9f24141ffae42b5"
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
