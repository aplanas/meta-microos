SUMMARY = "Library implementing the distributed SQLite"
DESCRIPTION = "dqlite is a C library implementing an embeddable and replicated \
SQL database engine with high-availability and automatic failover. \
 \
dqlite extends SQLite with a network protocol that can connect \
together various instances of an application and have them act as a \
highly-availablity cluster."
LICENSE = "LGPL-3.0-only-with-LGPL-3.0-linking-exception"

PV = "1.15.1"

RPM_NAME = "libdqlite0-1.15.1-1.1.aarch64.rpm"
RPM_HASH = "b472d94fc1dd70a4a6e8ddc0fa411c3ffff3a4021ef103753bc2c674565748d4df71a145765bd9a401df064c1b91e3a06b9747e4335c2ce331d7aee66b37edc0"

RPROVIDES:${PN} += "libdqlite.so.0 \
libdqlite0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libraft.so.3 \
libsqlite3.so.0 \
libuv.so.1"

inherit rpm
