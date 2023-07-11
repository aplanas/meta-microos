SUMMARY = "Java API for working with compressed files and archivers"
DESCRIPTION = "The Apache Commons Compress library defines an API for working with \
ar, cpio, Unix dump, tar, zip, gzip, XZ, Pack200 and bzip2 files. \
In version 1.14 read-only support for Brotli decompression has been added, \
but it has been removed from this package."
LICENSE = "Apache-2.0"

PV = "1.21"

RPM_NAME = "apache-commons-compress-1.21-2.7.noarch.rpm"
RPM_HASH = "609b260ea6dd72559c966aab01399ab6741b2e447a0bd689ac205998c9e3488e2d2c51e310c8c32a21c703fc4ba6a0bcc2f33d6a2664e5cc826c94f0c8fb9c42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-compress \
commons-compress \
jakarta-commons-compress \
mvn-commons-commons-compress \
mvn-commons-commons-compress-pom- \
mvn-commons-compress-commons-compress \
mvn-commons-compress-commons-compress-pom- \
mvn-org.apache.commons-commons-compress \
mvn-org.apache.commons-commons-compress-pom- \
osgi-org.apache.commons.compress"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
