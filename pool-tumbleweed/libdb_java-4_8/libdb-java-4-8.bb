SUMMARY = "Java Bindings for the Berkeley DB"
DESCRIPTION = "These are the Java bindings for the Berkeley DB. They are needed for \
the Java support of db and dbxml."
LICENSE = "BSD-3-Clause"

PV = "4.8.30"

RPM_NAME = "libdb_java-4_8-4.8.30-41.1.aarch64.rpm"
RPM_HASH = "57e776b19f914fa8a3b42e2c3dea91661b15289bc08eb7877574e8730f0f24639def6185f6d468459d53394bf976d6002cc21172053d37da2a147b3e7b922d9d"

RPROVIDES:${PN} += "db-java \
libdb-java-4-8 \
libdb-java-4.8.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4-8"

inherit rpm
