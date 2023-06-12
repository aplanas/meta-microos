SUMMARY = "Frontend to the PARI Computer Algebra System"
DESCRIPTION = " \
PARI/GP is a computer algebra system designed for computations \
in number theory (factorizations, algebraic number theory, elliptic \
curves) and other entities like matrices, polynomials, \
power series, algebraic numbers, and transcendental functions."
LICENSE = "GPL-2.0-only"

PV = "2.15.3"

RPM_NAME = "pari-gp-2.15.3-1.1.aarch64.rpm"
RPM_HASH = "2e7db05d663492c550ccb7e93e0e4066c68e943796722386dbae65fc72450d3a6710bb54bb6a3397df5e4066c40d97d8709e611adab47085d0bbc9861dd4510d"

RPROVIDES:${PN} += "config(pari-gp) \
pari-gp \
pari-gp(aarch-64) \
perl(PARI::822)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpari-gmp-tls.so.8()(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
