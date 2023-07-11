SUMMARY = "Documentation for the PARI Computer Algebra System"
DESCRIPTION = " \
PARI/GP is a computer algebra system designed for computations \
in number theory (factorizations, algebraic number theory, elliptic \
curves) and other entities like matrices, polynomials, \
power series, algebraic numbers, and transcendental functions. \
 \
 \
This package contains the documentation and examples for the PARI Computer Algebra System."
LICENSE = "GPL-2.0-only"

PV = "2.15.3"

RPM_NAME = "pari-doc-2.15.3-1.2.noarch.rpm"
RPM_HASH = "d187025c3512de2c662337dc8dda64427e46796aa37afc0e5c29ae3a2d15b5ac73cbee547b3f04bfc61efbbfe8cf97913c73ac23870079c8f12be7bc2f04f83f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-doc"

RDEPENDS:${PN} += ""

inherit rpm
