SUMMARY = "Least squares spectral analysis for Octave"
DESCRIPTION = "A package implementing tools to compute spectral decompositions of \
irregularly-spaced time series.  Currently includes functions based off the \
Lomb-Scargle periodogram and Adolf Mathias' implementation for R and C. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.4"

RPM_NAME = "octave-forge-lssa-0.1.4-1.12.aarch64.rpm"
RPM_HASH = "cce06b1e915dd3e182885b42cc77f3839ba15fac8e1a805ac2a1ca6719234ebc2517cb5384d9dd30d669adce8d20721bb93fce85ed679957948a4e0ad8239aaf"

RPROVIDES:${PN} += "octave-forge-lssa"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli"

inherit rpm
