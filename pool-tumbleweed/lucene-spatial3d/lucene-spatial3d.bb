SUMMARY = "Spatial3d module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'spatial3d' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-spatial3d-8.5.0-3.5.noarch.rpm"
RPM_HASH = "6fb4f7bf37024ab0437f91851870b26c0ca51d1e247a4c60fbc7a3e5d0c3aeb2b47ce4066ba2fb2051b672259b33c92a5b05c8e73dd52ad4a33ab19ecd9c850a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-spatial3d \
mvn-org.apache.lucene-lucene-spatial3d \
mvn-org.apache.lucene-lucene-spatial3d-pom- \
osgi-org.apache.lucene.spatial3d"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
