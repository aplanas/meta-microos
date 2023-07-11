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

RPM_NAME = "givaro-devel-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "d7168011e6c21568f2cabee5870358d431af5987bf81c11cd8c1ab76b35998ae13df89148798de2a1f933f92d5ea5660ee3794f623cd9668108fc7da8461040a"

RPROVIDES:${PN} += "givaro-devel \
pkgconfig-givaro"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgivaro9"

inherit rpm
