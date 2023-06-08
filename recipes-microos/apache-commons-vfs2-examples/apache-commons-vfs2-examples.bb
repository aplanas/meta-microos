SUMMARY = "Commons VFS Examples"
DESCRIPTION = "VFS is a Virtual File System library - Examples."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "apache-commons-vfs2-examples-2.2-1.17.noarch.rpm"
RPM_HASH = "89d92b66f74d61227e34c080a0594a3e6fd4dd3d25566d4a1aec0b2a8558c81ff7153adb9c1b949713083b8a72010132ac2ea4189a22e987b02899219de69441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-vfs2-examples mvn(org.apache.commons:commons-vfs2-examples) mvn(org.apache.commons:commons-vfs2-examples:pom:) osgi(org.apache.commons.commons-vfs2-examples)"
RDEPENDS:${PN} += "apache-commons-vfs2 java-headless javapackages-filesystem mvn(org.apache.commons:commons-vfs2)"

inherit rpm
