SUMMARY = "Least squares spectral analysis for Octave"
DESCRIPTION = "A package implementing tools to compute spectral decompositions of \
irregularly-spaced time series.  Currently includes functions based off the \
Lomb-Scargle periodogram and Adolf Mathias' implementation for R and C. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.4"

RPM_NAME = "octave-forge-lssa-0.1.4-1.13.aarch64.rpm"
RPM_HASH = "d7d47fceca64d3c687bc9996625ae8377cfa0b27a5f30658e2c0a9ecd37a5ac0c3982a11a2b6f12c9bee5819e4c2efddc30f218add3fdeeb04e1d47556fef3c8"

RPROVIDES:${PN} += "octave-forge-lssa"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli"

inherit rpm
