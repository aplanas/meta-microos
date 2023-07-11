SUMMARY = "Commons VFS Examples"
DESCRIPTION = "VFS is a Virtual File System library - Examples."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "apache-commons-vfs2-examples-2.2-1.18.noarch.rpm"
RPM_HASH = "5f95aa05952fd9c3c7f9ac54fbf42e73850a40577155d57c5bfcedc888248490fe5dfc83aa291564974685c4575e1c58ea57a20d2d3a8ccdc7f0af773e15141a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-vfs2-examples \
mvn-org.apache.commons-commons-vfs2-examples \
mvn-org.apache.commons-commons-vfs2-examples-pom- \
osgi-org.apache.commons.commons-vfs2-examples"

RDEPENDS:${PN} += "apache-commons-vfs2 \
java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-vfs2"

inherit rpm
