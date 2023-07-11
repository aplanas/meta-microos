SUMMARY = "Classification module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'classification' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-classification-8.5.0-3.5.noarch.rpm"
RPM_HASH = "555b770fed7b2019c62dfad0d83fa363b6b51a64487cfbb93159779dee973630a342802e238cbbab0c174e16b58e28c2287157eadc62ba8ddc811ec639bb43e0"
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
