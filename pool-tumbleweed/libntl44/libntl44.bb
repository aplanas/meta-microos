SUMMARY = "Library for Number Theory"
DESCRIPTION = "NTL is a C++ library providing data structures and algorithms for \
manipulating signed, arbitrary length integers, and for vectors, \
matrices, and polynomials over the integers and over finite fields."
LICENSE = "LGPL-2.1-or-later"

PV = "11.5.1"

RPM_NAME = "libntl44-11.5.1-1.8.aarch64.rpm"
RPM_HASH = "97ac800d52135f3e75f5827487979bff8b4cc5da3857223cb6f9c79cdff3d7663839e081b621484abf95222830a1b86fc1fc6e4b8ebf8912abcb26ab49c1b376"

RPROVIDES:${PN} += "libntl.so.44 \
libntl44"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgf2x.so.3 \
libgmp.so.10 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
