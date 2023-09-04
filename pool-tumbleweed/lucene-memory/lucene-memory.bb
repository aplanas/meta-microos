SUMMARY = "Memory module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'memory' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-memory-8.5.0-5.1.noarch.rpm"
RPM_HASH = "ca4c69cf2bcb30d80190630cc9b28071ffdaad64b7bf9fc7ee761b719bd99cfb6dcbe0f670679c5f9d2398d4892c51b48f11d0f95552854f4d39a96d0fde5350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-memory \
mvn-org.apache.lucene-lucene-memory \
mvn-org.apache.lucene-lucene-memory-pom- \
osgi-org.apache.lucene.memory"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
