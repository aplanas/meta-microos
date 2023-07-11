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

RPM_NAME = "arb-devel-2.23.0-2.2.aarch64.rpm"
RPM_HASH = "65371413c986d3542805bf9e71b7caf409dcaebdf387e5a75e73c95d63ac129bf93f92ebc15910cf77f26d4c28c05f6a2b06d1252273f75cb9d8b3e6e2bdcc71"

RPROVIDES:${PN} += "arb-devel"

RDEPENDS:${PN} += "libarb2"

inherit rpm
