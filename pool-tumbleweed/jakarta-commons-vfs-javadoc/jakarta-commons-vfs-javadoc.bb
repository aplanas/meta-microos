SUMMARY = "Commons Virtual Filesystem"
DESCRIPTION = "Commons VFS provides a single API for accessing various different \
   file systems. It presents a uniform view of the files from \
   various different sources, such as the files on local disk, on an \
   HTTP server, or inside a Zip archive. Some of the features of \
   Commons VFS are: * A single consistent API for accessing files of \
   different types."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "jakarta-commons-vfs-javadoc-1.0-33.7.noarch.rpm"
RPM_HASH = "b8a0509d77c091f3a8e73f56b2fbaf18b77754af3a6435fceea7e974a4782c5bcde59e7ef3908b35fd58e24554c800fb23a363ef4d6586fff547baa438c888bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-vfs-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
