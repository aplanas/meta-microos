SUMMARY = "Shared library for the PARI Computer Algebra System"
DESCRIPTION = " \
PARI/GP is a computer algebra system designed for computations \
in number theory (factorizations, algebraic number theory, elliptic \
curves) and other entities like matrices, polynomials, \
power series, algebraic numbers, and transcendental functions. \
 \
 \
This package contains shared library for the PARI CAS."
LICENSE = "GPL-2.0-only"

PV = "2.15.3"

RPM_NAME = "libpari-gmp-tls8-2.15.3-1.1.aarch64.rpm"
RPM_HASH = "cebdc11b4c2b6a95d16bb0e8be2c80a49f3e1adc87cd9cd1a7b3db6a2ae53ea3f14b555c18fce3a4972d13b702fa62c017ed4f6b4c297298d4f1a3aeceeddd37"

RPROVIDES:${PN} += "libpari-gmp \
libpari-gmp-tls.so.8 \
libpari-gmp-tls8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
