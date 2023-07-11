SUMMARY = "Samba Trivial Database"
DESCRIPTION = "TDB is a Trivial Database. In concept, it is very much like GDBM, and BSD's DB, \
except that it allows multiple simultaneous writers and uses locking \
internally to keep writers from trampling on each other. \
 \
This package contains the tdb1 library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.8"

RPM_NAME = "libtdb1-1.4.8-1.2.aarch64.rpm"
RPM_HASH = "9070b3686847a71ec64ca592ab5d68d2cc03066d28f9d6dbbf80ab5c7e888f71b0c9f74ee630ddcb61a102583293533e4edadccb089e1f070136a5fab5472ff7"

RPROVIDES:${PN} += "libtdb.so.1 \
libtdb1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
