SUMMARY = "Library for polynomial arithmetic in Z/nZ[x]"
DESCRIPTION = "zn_poly is a C library for polynomial arithmetic in Z/nZ[x], where n \
is any modulus that fits into an unsigned long."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "libzn_poly-0_9-0.9.2-2.11.aarch64.rpm"
RPM_HASH = "c3bfb91a638b0277a412dcafa537273169a3add7418f959d9c3e8d74e7f031e0783391d766e34fa4dcc188d84fb1f96c73b667635e9c99d0c944f240cfb03543"

RPROVIDES:${PN} += "libzn-poly-0-9 \
libzn-poly-0.9.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
