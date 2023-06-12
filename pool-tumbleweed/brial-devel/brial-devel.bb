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

RPM_NAME = "brial-devel-1.2.12-1.3.aarch64.rpm"
RPM_HASH = "e7c70d6929a13c84dc429ce2ca25ce9de8263696b0325e368a7a3e20a31b60a843c3209d79d5dee5350cdbf75c8c2cbb1fe9d181b2bfdaba1583131a7433cf88"

RPROVIDES:${PN} += "brial-devel \
brial-devel(aarch-64)"
RDEPENDS:${PN} += "boost-devel \
libbrial3"

inherit rpm
