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

RPM_NAME = "octave-forge-interval-3.2.1-1.8.aarch64.rpm"
RPM_HASH = "7cbc307155772224dd08c5e2a2391f346bfc9b4c2b5fcdde0bda6b760fecc374923fc786f23b267ec3775d80286daafbe2875261a2c328601e0531444fa370e1"

RPROVIDES:${PN} += "octave-forge-interval"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6 \
octave-cli"

inherit rpm
