SUMMARY = "Library for Number Theory"
DESCRIPTION = "NTL is a C++ library providing data structures and algorithms for \
manipulating signed, arbitrary length integers, and for vectors, \
matrices, and polynomials over the integers and over finite fields."
LICENSE = "LGPL-2.1-or-later"

PV = "11.5.1"

RPM_NAME = "libntl44-11.5.1-1.9.aarch64.rpm"
RPM_HASH = "551910fa5c592224cdc621ad1e5b44e6150d1876d0c4d92322fe1b87cba3e877f4d1407562e011caacdcff27deaf50741611f3572c3105e9ddd6832da21495a2"

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
