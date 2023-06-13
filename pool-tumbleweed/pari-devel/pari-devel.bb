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

RPM_NAME = "pari-devel-2.15.3-1.1.aarch64.rpm"
RPM_HASH = "19e6aa4d91a977aa77c5fb5fad6d48cc0cdafd8fa89561ea6fff4c1a128667b1dc78a796f2c1b3d3e74e1e85f8ec4ed85f39e173517dd5ae744287c02f428e2c"

RPROVIDES:${PN} += "pari-devel \
pari-devel(aarch-64)"

RDEPENDS:${PN} += "libpari-gmp-tls8"

inherit rpm
