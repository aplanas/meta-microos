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

PV = "2.15.4"

RPM_NAME = "libpari-gmp-tls8-2.15.4-1.1.aarch64.rpm"
RPM_HASH = "82b0b484fad69412a6726827585269bea29afdf34fc6620a7b8d9d8f68c6353ce78445389e62f376d4e94682ddd7c78a3937b0fa6448d08308877457679c61e9"

RPROVIDES:${PN} += "libpari-gmp \
libpari-gmp-tls.so.8 \
libpari-gmp-tls8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
