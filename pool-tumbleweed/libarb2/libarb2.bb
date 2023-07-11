SUMMARY = "Arbitrary-precision floating-point ball arithmetic library"
DESCRIPTION = "Arb is a C library for arbitrary-precision floating-point ball \
(mid-rad interval) arithmetic. It supports complex numbers, \
polynomials, matrices, and evaluation of special functions, with \
error bounding."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.23.0"

RPM_NAME = "libarb2-2.23.0-2.2.aarch64.rpm"
RPM_HASH = "b18dde56cf0ed6b16cb79b96f36533d6467277aea2a346f7a1b87754f236ea27eaecfe28d13665c16dae843f5abd5acf1d3ab07f79a17ee273e722bce596084f"

RPROVIDES:${PN} += "libarb.so.2 \
libarb2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflint.so.17 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6"

inherit rpm
