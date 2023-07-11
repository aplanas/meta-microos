SUMMARY = "Libraries and Header Files to Develop Programs with tdb1 Support"
DESCRIPTION = "TDB is a Trivial Database. In concept, it is very much like GDBM, and BSD's DB, \
except that it allows multiple simultaneous writers and uses locking \
internally to keep writers from trampling on each other. \
 \
This package contains libraries and header files need for development."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.8"

RPM_NAME = "libtdb-devel-1.4.8-1.2.aarch64.rpm"
RPM_HASH = "a058dcf98d255b7cbe54c8dbe4b14a2008b6573a5b2eb7842e303eedbbf62f31f32e2b5805aca9a9d886b8dde58657537e792362da1fdc8f5b7b9156dd7e52f3"

RPROVIDES:${PN} += "libtdb-devel \
pkgconfig-tdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtdb1 \
pkgconfig"

inherit rpm
