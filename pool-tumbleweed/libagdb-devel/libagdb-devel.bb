SUMMARY = "Development files for libagdb"
DESCRIPTION = "libagdb is a library to access the SuperFetch database format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libagdb."
LICENSE = "LGPL-3.0-or-later"

PV = "20210429"

RPM_NAME = "libagdb-devel-20210429-3.5.aarch64.rpm"
RPM_HASH = "4199207cd55c997bdc0aeb61a1d601b98d3e793c5748c8771e60b4ac0242c6572e0a1249047712238dc4a9c51e3222621880f36d5967ea070f1a3184837a000e"

RPROVIDES:${PN} += "libagdb-devel \
pkgconfig-libagdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libagdb1 \
libbfio-devel"

inherit rpm
