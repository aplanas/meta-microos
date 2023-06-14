SUMMARY = "Computer algebra system"
DESCRIPTION = "Mathomatic is a free, portable, general-purpose Computer Algebra System (CAS) \
that can automatically solve, differentiate, simplify, combine, and compare \
algebraic equations, perform standard, complex number, modular, and polynomial \
arithmetic, etc. It does some calculus and is very easy to learn and use. \
Plotting expressions with gnuplot is also supported. This package \
is complete, including Mathomatic, the Prime Number Tools, m4 Mathomatic, \
and all documentation."
LICENSE = "LGPL-2.1-or-later"

PV = "16.0.5"

RPM_NAME = "mathomatic-16.0.5-1.13.aarch64.rpm"
RPM_HASH = "66e37cdf5ca02d9b780c5b97d10813ddf32d5ae05125d45b0433a12b8c41d50b60dbfe0510f2f56efaa18e4a21d879fd8521501e305167775309b730146a7680"

RPROVIDES:${PN} += "mathomatic"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libreadline.so.8 \
m4"

inherit rpm
