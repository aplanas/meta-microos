SUMMARY = "Spatial3d module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'spatial3d' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-spatial3d-8.5.0-4.1.noarch.rpm"
RPM_HASH = "65d4700a5883fa4268153ca6440471073fc5ba0bee8548698c96ced4a0fd79c5592f47afa8e43eea640254d3fb8ac5fd199cdcda6d4e576e06cd1cf658728407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-spatial3d \
mvn-org.apache.lucene-lucene-spatial3d \
mvn-org.apache.lucene-lucene-spatial3d-pom- \
osgi-org.apache.lucene.spatial3d"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
