SUMMARY = "Development files for Givaro, an algorithmic-algebraic computation library"
DESCRIPTION = "Givaro is a C++ library for arithmetic and algebraic computations. \
 \
Its main features are implementations of the basic arithmetic of many \
mathematical entities: Primes fields, Extensions Fields, Finite \
Fields, Finite Rings, Polynomials, Algebraic numbers, Arbitrary \
precision integers and rationals. \
 \
This subpackage contains the include files and library links for \
developing against the Givaro library."
LICENSE = "CECILL-B"

PV = "4.2.0"

RPM_NAME = "givaro-devel-4.2.0-2.1.aarch64.rpm"
RPM_HASH = "29be90152b8a4b278fb6283b17b57418b9f8ad459a7a9ca93ff5e98af276c720be02748e7c921a4fc18011229ad19c8b1b94019119308974a0a4c41bfc095a9d"

RPROVIDES:${PN} += "givaro-devel \
pkgconfig-givaro"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libgivaro9"

inherit rpm
