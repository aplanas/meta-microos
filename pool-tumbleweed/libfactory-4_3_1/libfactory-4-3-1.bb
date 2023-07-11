SUMMARY = "Singular's factorization library"
DESCRIPTION = "Factory is a C++ class library that implements a recursive \
representation of multivariate polynomial data. Factory handles \
sparse multivariate polynomials over different coefficient domains, \
such as Z, Q and GF(q), as well as algebraic extensions over Q and \
GF(q) in an efficient way. Factory includes algorithms for computing \
univariate and multivariate gcds, resultants, chinese remainders, and \
several algorithms to factorize univariate polynomials over the \
integers and over finite fields."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.3.1.p3"

RPM_NAME = "libfactory-4_3_1-4.3.1.p3-1.4.aarch64.rpm"
RPM_HASH = "3e4a5e03a69df789d3cbe61ad3d8e3e231f67d3018308ddd46d2ecfd0b6dd5a7cf1d32003e37d376dc4cf6ff5371282b095cd05c79a398c0dda4af954aa15a91"

RPROVIDES:${PN} += "libfactory-4-3-1 \
libfactory-4.3.1.p3.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflint.so.17 \
libgmp.so.10 \
libm.so.6 \
libntl.so.44 \
libomalloc-4.3.1.p3.so \
libsingular-resources-4.3.1.p3.so \
libstdc++.so.6"

inherit rpm
