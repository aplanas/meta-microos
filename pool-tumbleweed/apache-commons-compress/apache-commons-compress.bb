SUMMARY = "Java API for working with compressed files and archivers"
DESCRIPTION = "The Apache Commons Compress library defines an API for working with \
ar, cpio, Unix dump, tar, zip, gzip, XZ, Pack200 and bzip2 files. \
In version 1.14 read-only support for Brotli decompression has been added, \
but it has been removed from this package."
LICENSE = "Apache-2.0"

PV = "1.21"

RPM_NAME = "apache-commons-compress-1.21-2.6.noarch.rpm"
RPM_HASH = "8e291727f003d0e826cd36c4a67465f0aedfb6bf30f0e9b4919c688c98ba131ac4cecc66cb239301ae7691f6fdc2f561422aae66d8fe7298cb6d0ba07482dfee"
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
