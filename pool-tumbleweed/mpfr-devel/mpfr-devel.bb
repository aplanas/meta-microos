SUMMARY = "Development files for the GNU multiple-precision floating-point library"
DESCRIPTION = "Development files for the GNU multiple-precision floating-point library. \
 \
The MPFR library is a C library for multiple-precision floating-point \
computations with exact rounding (also called correct rounding). It is \
based on the GMP multiple-precision library."
LICENSE = "LGPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "mpfr-devel-4.2.0-3.2.aarch64.rpm"
RPM_HASH = "ce93535eb11bac8cc6e7bf0c72d498d923eba2b161e28d2616860ae0ebebdf999edcbc30bcf10ecf454c849b418ac835fc10af4640d9b67b3cb269ab72bea442"

RPROVIDES:${PN} += "mpfr-devel \
pkgconfig-mpfr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
gmp-devel \
libmpfr6"

inherit rpm
