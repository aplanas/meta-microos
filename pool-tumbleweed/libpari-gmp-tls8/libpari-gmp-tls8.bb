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

RPM_NAME = "libpari-gmp-tls8-2.15.3-1.2.aarch64.rpm"
RPM_HASH = "d07fdcffa6d0d840d2d4f9e8acc96ae80ee94b19f3d3a0ee22165f67755477af98f617e1d6791eff22f4dded9de5f694e9b588cb1ceec9a2bd9ae4f71ddcd473"

RPROVIDES:${PN} += "libpari-gmp \
libpari-gmp-tls.so.8 \
libpari-gmp-tls8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
