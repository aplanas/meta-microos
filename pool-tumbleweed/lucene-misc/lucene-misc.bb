SUMMARY = "Misc module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'misc' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-misc-8.5.0-4.1.aarch64.rpm"
RPM_HASH = "0983ebe7d4481d5452e77b5685fd366ac44b6dfcddcc837fb4d2980220f2e2b67437e4e0189f08e21460668c728b628fe964e4af03dbb82a3e0d1a7f06b48e6e"

RPROVIDES:${PN} += "lucene-misc \
mvn-org.apache.lucene-lucene-misc \
mvn-org.apache.lucene-lucene-misc-pom- \
osgi-org.apache.lucene.misc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core \
osgi-org.apache.lucene.core"

inherit rpm
