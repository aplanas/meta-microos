SUMMARY = "Development files for Arb, an Arbitrary-precision ball arithmetic library"
DESCRIPTION = "Arb is a C library for arbitrary-precision floating-point ball \
(mid-rad interval) arithmetic. It supports complex numbers, \
polynomials, matrices, and evaluation of special functions, with \
error bounding. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of Arb."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.23.0"

RPM_NAME = "arb-devel-2.23.0-2.1.aarch64.rpm"
RPM_HASH = "057370f89b62950b28adfa3a8a4993d8a081d76db12f3aff3863958fe6961dd390d1b7f8c8a65104e31d31eda2ca61972d5ef593dfc406073b295c4ef4ba7a7a"

RPROVIDES:${PN} += "arb-devel arb-devel(aarch-64)"
RDEPENDS:${PN} += "libarb2"

inherit rpm
