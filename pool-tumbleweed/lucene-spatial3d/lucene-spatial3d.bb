SUMMARY = "Spatial3d module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'spatial3d' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-spatial3d-8.5.0-5.1.noarch.rpm"
RPM_HASH = "beeea0dc60525f09687fcef72185ecd3143dbf2cc2bfdddd14ae738b30904a396b3567a99c2c600220473a6cddd42b82df4db074571b0bceda80080a811d0fea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-spatial3d \
mvn-org.apache.lucene-lucene-spatial3d \
mvn-org.apache.lucene-lucene-spatial3d-pom- \
osgi-org.apache.lucene.spatial3d"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
