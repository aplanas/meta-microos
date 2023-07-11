SUMMARY = "Development files for the Osmocom core library"
DESCRIPTION = "libosmocore is a library with various utility functions shared \
between OpenBSC and OsmocomBB. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmocore."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmocore-devel-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "8f41d4e8b4b6279fd3d129e037394433791ac49c3bf271d5aa350cb74c0e83d5a0702e6fb1c59174e5a7c1037dab8a4812869b3a7cebfef83586046f258e0872"

RPROVIDES:${PN} += "libosmocore-devel \
pkgconfig-libosmocore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocore20 \
libtalloc-devel \
pkgconfig-libmnl \
pkgconfig-libsctp \
pkgconfig-talloc"

inherit rpm
