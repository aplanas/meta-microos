SUMMARY = "Library implementing the distributed SQLite"
DESCRIPTION = "dqlite is a C library implementing an embeddable and replicated \
SQL database engine with high-availability and automatic failover. \
 \
dqlite extends SQLite with a network protocol that can connect \
together various instances of an application and have them act as a \
highly-availablity cluster."
LICENSE = "LGPL-3.0-only-WITH-LGPL-3.0-linking-exception"

PV = "1.14.0"

RPM_NAME = "libdqlite0-1.14.0-2.3.aarch64.rpm"
RPM_HASH = "d1ca518cff3929a9a044bf65d89045a07fefbadd149225e7bd861e204a372fc99e09321aa4c8048b3267c8583d62c9fc708a0d15655f1339a9a34c5eb9fc9524"

RPROVIDES:${PN} += "libdqlite.so.0()(64bit) \
libdqlite0 \
libdqlite0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libraft.so.3()(64bit) \
libsqlite3.so.0()(64bit) \
libuv.so.1()(64bit)"

inherit rpm
