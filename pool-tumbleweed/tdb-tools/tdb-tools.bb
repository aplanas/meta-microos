SUMMARY = "Tools to manipulate tdb files"
DESCRIPTION = "TDB is a Trivial Database. In concept, it is very much like GDBM, and BSD's DB, \
except that it allows multiple simultaneous writers and uses locking \
internally to keep writers from trampling on each other. \
 \
This package contains tools to manage Tdb files."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.8"

RPM_NAME = "tdb-tools-1.4.8-1.1.aarch64.rpm"
RPM_HASH = "ec404709e7cd2ae57a2464989919741f2c9df2e11de30283538b2924ed4d85325834c11010fec3abb844728bdcfc0f404b03d314e68535456325d68c0a94deda"

RPROVIDES:${PN} += "tdb-tools \
tdb-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtdb.so.1()(64bit)"

inherit rpm
