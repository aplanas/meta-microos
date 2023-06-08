SUMMARY = "Header files for cddlib"
DESCRIPTION = "cddlib is a C implementation of the Double Description Method of \
Motzkin et al. for generating all vertices (i.e. extreme points) and \
extreme rays of a general convex polyhedron in R^d given by a system \
of linear inequalities. \
 \
This package contains the headers for the C library."
LICENSE = "GPL-2.0-or-later"

PV = "0.94m"

RPM_NAME = "cddlib-devel-0.94m-1.10.aarch64.rpm"
RPM_HASH = "43cd53842687c3b0ed88dad931d9f643abca1559e7f2f0e2b5415aa34ba7a0e24d771981df3bfcbd6f43a65325c15779c388e058aebd3179f2b0f5b974b3ea27"

RPROVIDES:${PN} += "cddlib-devel cddlib-devel(aarch-64) pkgconfig(cddlib)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gmp-devel libcdd0"

inherit rpm
