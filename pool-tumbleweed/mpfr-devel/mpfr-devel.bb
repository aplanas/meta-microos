SUMMARY = "Development files for the GNU multiple-precision floating-point library"
DESCRIPTION = "Development files for the GNU multiple-precision floating-point library. \
 \
The MPFR library is a C library for multiple-precision floating-point \
computations with exact rounding (also called correct rounding). It is \
based on the GMP multiple-precision library."
LICENSE = "LGPL-3.0-or-later"

PV = "4.2.1"

RPM_NAME = "mpfr-devel-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "0e8f652d4a7797233fae25586814eb156555f642cb462712b02174fa8c2cf6d0c32410544e1bc056e3baecc4502a300b684c39976ad972cbe5160c3047f891c0"

RPROVIDES:${PN} += "mpfr-devel \
pkgconfig-mpfr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
gmp-devel \
libmpfr6"

inherit rpm
