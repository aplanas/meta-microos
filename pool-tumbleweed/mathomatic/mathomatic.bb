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

RPM_NAME = "mathomatic-16.0.5-1.14.aarch64.rpm"
RPM_HASH = "90a3907e5f87855bae0c605823b53356a3f39e88a76d3c038f7922c0b1d64a2495b4712b9032be9c7b29ec7e32774038cf31a047271dc471eb463b88efe5e2e2"

RPROVIDES:${PN} += "mathomatic"

RDEPENDS:${PN} += "/usr/bin/python \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libreadline.so.8 \
m4"

inherit rpm
