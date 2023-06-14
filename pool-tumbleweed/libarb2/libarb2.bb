SUMMARY = "Arbitrary-precision floating-point ball arithmetic library"
DESCRIPTION = "Arb is a C library for arbitrary-precision floating-point ball \
(mid-rad interval) arithmetic. It supports complex numbers, \
polynomials, matrices, and evaluation of special functions, with \
error bounding."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.23.0"

RPM_NAME = "libarb2-2.23.0-2.1.aarch64.rpm"
RPM_HASH = "070b64bdffa34cedcdd99c58d2fd9a99acca76dc9fc8407cffb6aeba9d8fbbfe78a48ed9d2f3c65ebe05e1d95dbeeaeefac10f3f502f71815b216a448ff7324b"

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
