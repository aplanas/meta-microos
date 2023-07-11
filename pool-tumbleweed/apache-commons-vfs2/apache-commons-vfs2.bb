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

RPM_NAME = "apache-commons-vfs2-2.2-1.18.noarch.rpm"
RPM_HASH = "eb3b30d2e651ecad2500ab10ca5d36622e4956155522094c7e92f13dcdb673e030eb42efdcbae31eee757121edba29b732f329621d57fda2b83b65dec21ed84f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-vfs2 \
mvn-org.apache.commons-commons-vfs2 \
mvn-org.apache.commons-commons-vfs2-pom- \
osgi-org.apache.commons.commons-vfs2"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging"

inherit rpm
