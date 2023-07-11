SUMMARY = "Queries module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'queries' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-queries-8.5.0-3.5.noarch.rpm"
RPM_HASH = "e163c4ba2c046fb9c6d3b51b6089bf0ea2c8b2df25f9c8654b633d548e10833cf8a127c44853c51f0a442fa3012d3ca49636a0f0ab782bfab44ab89990baaf82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-queries \
mvn-org.apache.lucene-lucene-queries \
mvn-org.apache.lucene-lucene-queries-pom- \
osgi-org.apache.lucene.queries"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
