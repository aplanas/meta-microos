SUMMARY = "Samba Trivial Database"
DESCRIPTION = "TDB is a Trivial Database. In concept, it is very much like GDBM, and BSD's DB, \
except that it allows multiple simultaneous writers and uses locking \
internally to keep writers from trampling on each other. \
 \
This package contains the tdb1 library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.8"

RPM_NAME = "libtdb1-1.4.8-1.1.aarch64.rpm"
RPM_HASH = "0f1b2c5d3afc5368928887d7ec3d1dc02ec854975e65b0415785e8d06bf08d96897913b9cc2a905b14c61dc51cab558c20b8d6a537ae43faa7c0a4dad142f92f"

RPROVIDES:${PN} += "libtdb.so.1()(64bit) \
libtdb1 \
libtdb1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
