SUMMARY = "The Polynomials over Boolean Rings Computer Algebra System library"
DESCRIPTION = "The core of PolyBoRi/BRiAl is a C++ library, which provides \
high-level data types for Boolean polynomials and monomials, exponent \
vectors, as well as for the underlying polynomial rings and subsets \
of the powerset of the Boolean variables. As a unique approach, \
binary decision diagrams are used as internal storage type for \
polynomial structures."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.12"

RPM_NAME = "libbrial3-1.2.12-1.3.aarch64.rpm"
RPM_HASH = "11b1b36d622c66bf49d0642796bc7dd80d1bd708a317efebc3bbfae00bd50412df7020c21f3a75edf5439a5563ebd0a81a74c54a790c28d747f3594288eca58c"

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
