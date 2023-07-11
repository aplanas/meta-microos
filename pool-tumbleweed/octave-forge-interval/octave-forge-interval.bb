SUMMARY = "Real-valued interval arithmetic for Octave"
DESCRIPTION = "The interval package for real-valued interval arithmetic allows to \
evaluate functions over subsets of their domain.  All results are verified, \
because interval computations automatically keep track of any errors. \
 \
These concepts can be used to handle uncertainties, estimate arithmetic errors \
and produce reliable results.  Also it can be applied to computer-assisted \
proofs, constraint programming, and verified computing. \
 \
The implementation is based on interval boundaries represented by binary64 \
numbers and is conforming to IEEE Std 1788-2015, IEEE standard for interval \
arithmetic. \
 \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "octave-forge-interval-3.2.1-1.9.aarch64.rpm"
RPM_HASH = "9bafdde5236fdbaf4aaf8fa8ec9e8e369c7c3b0f57fd6351e21cdcf29fb8fac771d7886b1751b91270fc1426f14ddd2651625a8bf9775276f26d7cb1e5e75a50"

RPROVIDES:${PN} += "octave-forge-interval"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6 \
octave-cli"

inherit rpm
