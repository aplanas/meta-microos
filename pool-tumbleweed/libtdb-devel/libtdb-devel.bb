SUMMARY = "Libraries and Header Files to Develop Programs with tdb1 Support"
DESCRIPTION = "TDB is a Trivial Database. In concept, it is very much like GDBM, and BSD's DB, \
except that it allows multiple simultaneous writers and uses locking \
internally to keep writers from trampling on each other. \
 \
This package contains libraries and header files need for development."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4.8"

RPM_NAME = "libtdb-devel-1.4.8-1.1.aarch64.rpm"
RPM_HASH = "765ea61182e51c71183e0fad2dc202c0db114144b10cfc0ab66422331bc61075708e8cff4723f38fbfecd0e777b3d578b8ec2480e836dd70ac304c85e7a236d3"

RPROVIDES:${PN} += "libtdb-devel \
libtdb-devel(aarch-64) \
pkgconfig(tdb)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtdb1 \
pkgconfig"

inherit rpm
