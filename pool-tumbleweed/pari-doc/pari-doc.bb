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

PV = "2.15.4"

RPM_NAME = "pari-doc-2.15.4-1.1.noarch.rpm"
RPM_HASH = "4205d1b14b67fc0739cc2f45c9fb2e0fbaa17a368810ba12831667c4772649a193505d761a79aa6713212cb0b50a4c14fd91347089f7b971b325137fd7d7ee2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-doc"

RDEPENDS:${PN} += ""

inherit rpm
