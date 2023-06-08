SUMMARY = "Commons Virtual File System"
DESCRIPTION = "Commons VFS provides a single API for accessing various \
different file systems. It presents a uniform view of the \
files from various different sources, such as the files on \
local disk, on an HTTP server, or inside a Zip archive. \
Some of the features of Commons VFS are: \
* A single consistent API for accessing files of different \
 types. \
* Support for numerous file system types. \
* Caching of file information. Caches information in-JVM, \
 and optionally can cache remote file information on the \
 local file system. \
* Event delivery. \
* Support for logical file systems made up of files from \
 various different file systems. \
* Utilities for integrating Commons VFS into applications, \
 such as a VFS-aware ClassLoader and URLStreamHandlerFactory. \
* A set of VFS-enabled Ant tasks."
LICENSE = "Apache-2.0"

PV = "2.2"

RPM_NAME = "apache-commons-vfs2-2.2-1.17.noarch.rpm"
RPM_HASH = "b861a8b6eeeff99c8d50a2f8ca06296d850a0c1758d870282f044a3165135776061543c5ab784b432a1ae0ff796853e51b4e7ffc295df26fb718fe58c65fb219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-vfs2 mvn(org.apache.commons:commons-vfs2) mvn(org.apache.commons:commons-vfs2:pom:) osgi(org.apache.commons.commons-vfs2)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(commons-logging:commons-logging)"

inherit rpm
