SUMMARY = "Java Bindings for the Berkeley DB"
DESCRIPTION = "These are the Java bindings for the Berkeley DB. They are needed for \
the Java support of db and dbxml."
LICENSE = "BSD-3-Clause & Sleepycat"

PV = "4.8.30"

RPM_NAME = "libdb_java-4_8-4.8.30-42.1.aarch64.rpm"
RPM_HASH = "c76541fb33a2d0d8f5d3f4e784d20c24ea2572dc7e37b7805edcb9730767c0c02786b0d784dee6aef846eda36a4b59983fb613b6593c3be39c94a7aafedc1d17"

RPROVIDES:${PN} += "db-java \
libdb-java-4-8 \
libdb-java-4.8.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4-8"

inherit rpm
