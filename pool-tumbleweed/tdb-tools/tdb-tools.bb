SUMMARY = "Tools to manipulate tdb files"
DESCRIPTION = "TDB is a Trivial Database. In concept, it is very much like GDBM, and BSD's DB, \
except that it allows multiple simultaneous writers and uses locking \
internally to keep writers from trampling on each other. \
 \
This package contains tools to manage Tdb files."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.8"

RPM_NAME = "tdb-tools-1.4.8-1.2.aarch64.rpm"
RPM_HASH = "d965010eeea17dc03713a947dbcaf3f34c49f0d5f15fa60e01b5734991029081d86c1378abacb4963f88cae4ec1f93a219fcc35315a4047130a928ca01506ef9"

RPROVIDES:${PN} += "tdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtdb.so.1"

inherit rpm
