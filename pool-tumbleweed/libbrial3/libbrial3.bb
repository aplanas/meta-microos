SUMMARY = "The Polynomials over Boolean Rings Computer Algebra System library"
DESCRIPTION = "The core of PolyBoRi/BRiAl is a C++ library, which provides \
high-level data types for Boolean polynomials and monomials, exponent \
vectors, as well as for the underlying polynomial rings and subsets \
of the powerset of the Boolean variables. As a unique approach, \
binary decision diagrams are used as internal storage type for \
polynomial structures."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.12"

RPM_NAME = "libbrial3-1.2.12-1.4.aarch64.rpm"
RPM_HASH = "9f2dac5308c069b05069f4059711f26f6e709f435e2ff0d9e0df526c0cf5b0f4f58a5e6274b552d17e60aa50785e9f179b151aaf4d830f0ecd86a75b43cb48f2"

RPROVIDES:${PN} += "libbrial-groebner.so.3 \
libbrial.so.3 \
libbrial3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libm4ri-0.0.20200125.so \
libstdc++.so.6"

inherit rpm
