SUMMARY = "Development files for polybori, a CAS for Boolean Polynomials"
DESCRIPTION = "The core of PolyBoRi/BRiAl is a C++ library, which provides \
high-level data types for Boolean polynomials and monomials, exponent \
vectors, as well as for the underlying polynomial rings and subsets \
of the powerset of the Boolean variables. As a unique approach, \
binary decision diagrams are used as internal storage type for \
polynomial structures. \
 \
This subpackage contains the include files and library links for \
developing with polybori/brial libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.12"

RPM_NAME = "brial-devel-1.2.12-1.4.aarch64.rpm"
RPM_HASH = "a66545fb5d445c40faad46366e4a2c5a599c76e8d84168bfe0841cbdac03f2a1259da0127ff11717553cb7e51aa588ee5b586f445ed6287476b4d88d876b5b3b"

RPROVIDES:${PN} += "brial-devel"

RDEPENDS:${PN} += "boost-devel \
libbrial3"

inherit rpm
