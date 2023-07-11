SUMMARY = "Commons Virtual Filesystem"
DESCRIPTION = "Commons VFS provides a single API for accessing various different \
   file systems. It presents a uniform view of the files from \
   various different sources, such as the files on local disk, on an \
   HTTP server, or inside a Zip archive. Some of the features of \
   Commons VFS are: * A single consistent API for accessing files of \
   different types."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "jakarta-commons-vfs-1.0-33.7.noarch.rpm"
RPM_HASH = "713c84291367463c449af3feb070091a5abb5bfd02b54f7f87398ba6eb6cbfb33dabc174254e82590541a9a2c1892add7d60f083365f13938b4e7b39f1556060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-vfs \
mvn-org.apache.commons-commons-vfs \
mvn-org.apache.commons-commons-vfs-examples \
mvn-org.apache.commons-commons-vfs-examples-pom- \
mvn-org.apache.commons-commons-vfs-pom- \
mvn-org.apache.commons-commons-vfs-sandbox \
mvn-org.apache.commons-commons-vfs-sandbox-pom-"

RDEPENDS:${PN} += "jakarta-commons-codec \
jakarta-commons-collections \
jakarta-commons-httpclient3 \
jakarta-commons-logging \
jakarta-commons-net \
jakarta-slide-webdavclient \
java-headless \
javamail \
javapackages-filesystem \
jcifs \
jdom \
jsch \
mvn-commons-logging-commons-logging \
oro \
xml-commons-apis"

inherit rpm
