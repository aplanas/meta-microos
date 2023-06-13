SUMMARY = "Commons Virtual Filesystem"
DESCRIPTION = "Commons VFS provides a single API for accessing various different \
   file systems. It presents a uniform view of the files from \
   various different sources, such as the files on local disk, on an \
   HTTP server, or inside a Zip archive. Some of the features of \
   Commons VFS are: * A single consistent API for accessing files of \
   different types."
LICENSE = "Apache-2.0"

PV = "1.0"

RPM_NAME = "jakarta-commons-vfs-javadoc-1.0-33.6.noarch.rpm"
RPM_HASH = "e87630ce7a8e9c52ef1ef71a2e365aa2761e24c7f2fe7483217f4993ac0884ea89e0f485e80aaed6f2079cb41f44bfb65aa146e6e84d303c4c88f992d8c193dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-vfs-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
