SUMMARY = "Commons Virtual Filesystem"
DESCRIPTION = "Commons VFS provides a single API for accessing various different \
   file systems. It presents a uniform view of the files from \
   various different sources, such as the files on local disk, on an \
   HTTP server, or inside a Zip archive. Some of the features of \
   Commons VFS are: * A single consistent API for accessing files of \
   different types."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "jakarta-commons-vfs-1.0-33.6.noarch.rpm"
RPM_HASH = "e4304a4ee2f1eebeea8377ddc8993cadda111a8797d48248fc66e9e4c02fb6186096d8b688854f8b3f481a22ff95fa9418e9258bd1687f0fba2e623fc6820a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-vfs \
mvn(org.apache.commons:commons-vfs) \
mvn(org.apache.commons:commons-vfs-examples) \
mvn(org.apache.commons:commons-vfs-examples:pom:) \
mvn(org.apache.commons:commons-vfs-sandbox) \
mvn(org.apache.commons:commons-vfs-sandbox:pom:) \
mvn(org.apache.commons:commons-vfs:pom:)"

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
mvn(commons-logging:commons-logging) \
oro \
xml-commons-apis"

inherit rpm
