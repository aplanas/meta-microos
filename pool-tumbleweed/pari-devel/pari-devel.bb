SUMMARY = "Development files for the PARI Computer Algebra System"
DESCRIPTION = " \
PARI/GP is a computer algebra system designed for computations \
in number theory (factorizations, algebraic number theory, elliptic \
curves) and other entities like matrices, polynomials, \
power series, algebraic numbers, and transcendental functions. \
 \
 \
This package contains development files for the PARI CAS."
LICENSE = "GPL-2.0-only"

PV = "2.15.3"

RPM_NAME = "pari-devel-2.15.3-1.2.aarch64.rpm"
RPM_HASH = "c216b5242127ea6146a86620ff9faad083bb178239f0d9112893f225db3c860c079a7f90d3d669f2e449288a322da837e3c722e90081ea09d0f80f07f98c50b8"

RPROVIDES:${PN} += "pari-devel"

RDEPENDS:${PN} += "libpari-gmp-tls8"

inherit rpm
