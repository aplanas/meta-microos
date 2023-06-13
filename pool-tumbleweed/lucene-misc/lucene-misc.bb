SUMMARY = "Misc module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'misc' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-misc-8.5.0-3.4.aarch64.rpm"
RPM_HASH = "6baba57f00509699c19dbc186781134f196c7b004f78923a96b7158650a8c3052a4db57d9a2ed228845cbdd4c39131fca82e4910508ebaf65b3ac81dd21a09c9"

RPROVIDES:${PN} += "lucene-misc \
lucene-misc(aarch-64) \
mvn(org.apache.lucene:lucene-misc) \
mvn(org.apache.lucene:lucene-misc:pom:) \
osgi(org.apache.lucene.misc)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.lucene:lucene-core) \
osgi(org.apache.lucene.core)"

inherit rpm
