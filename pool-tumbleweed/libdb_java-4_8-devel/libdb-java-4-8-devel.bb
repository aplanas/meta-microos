SUMMARY = "Java Bindings for the Berkeley DB"
DESCRIPTION = "These are the Java bindings for the Berkeley DB. They are needed for \
the Java support of db and dbxml. \
 \
These are the development files."
LICENSE = "BSD-3-Clause & Sleepycat"

PV = "4.8.30"

RPM_NAME = "libdb_java-4_8-devel-4.8.30-42.1.aarch64.rpm"
RPM_HASH = "4af7b59655766c44d781b7851ae27ae122ae572421b54488911c614323b8ce0c6738f3c9c807e0837f6b8b28edcb0abf75c5bb05a3c8b9217c2ca8c56db40daa"

RPROVIDES:${PN} += "db-java-devel \
libdb-java-4-8-devel"

RDEPENDS:${PN} += "glibc-devel \
libdb-java-4-8"

inherit rpm
