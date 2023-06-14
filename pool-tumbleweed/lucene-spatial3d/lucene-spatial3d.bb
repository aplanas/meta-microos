SUMMARY = "Spatial3d module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'spatial3d' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.5.0"

RPM_NAME = "lucene-spatial3d-8.5.0-3.4.noarch.rpm"
RPM_HASH = "530260c2ae831f6739a391d022f0274514b00c2d9b6946540b6c751a523c14a87e66598fb63904ed61aefad6f200366b8e57a35f720cc004f8974e51ef431b6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-spatial3d \
mvn-org.apache.lucene-lucene-spatial3d \
mvn-org.apache.lucene-lucene-spatial3d-pom- \
osgi-org.apache.lucene.spatial3d"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm
