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

PV = "2.15.4"

RPM_NAME = "pari-devel-2.15.4-1.1.aarch64.rpm"
RPM_HASH = "878199e0e8f4f6c9a37b6009e247d85f9af1b35a6cc5174260a4fdc3e7a73cb8ba4894253ea327b61ca84d72545537c268d4b402196f1a68bf5f5807752e5bfe"

RPROVIDES:${PN} += "pari-devel"

RDEPENDS:${PN} += "libpari-gmp-tls8"

inherit rpm
