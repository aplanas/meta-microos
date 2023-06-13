SUMMARY = "Queries module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'queries' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-queries-8.5.0-3.4.noarch.rpm"
RPM_HASH = "e785c640d627b1b3d5c6b22df4c342c0c748278a5ef73dad741d4641043ee833ebb5be823a0828fb60a1ec5fef3d01a29694f64856c543a49be14acea2dddd58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-queries \
mvn(org.apache.lucene:lucene-queries) \
mvn(org.apache.lucene:lucene-queries:pom:) \
osgi(org.apache.lucene.queries)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.lucene:lucene-core)"

inherit rpm
