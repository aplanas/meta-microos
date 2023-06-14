SUMMARY = "The Large Time-Frequency Analysis Toolbox for Octave"
DESCRIPTION = "The Large Time/Frequency Analysis Toolbox (LTFAT) is a Matlab/Octave toolbox \
for working with time-frequency analysis, wavelets and signal processing. \
It is intended both as an educational and a computational tool. The toolbox \
provides a large number of linear transforms including Gabor and wavelet \
transforms along with routines for constructing windows (filter prototypes) \
and routines for manipulating coefficients. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.0"

RPM_NAME = "octave-forge-ltfat-2.5.0-1.4.aarch64.rpm"
RPM_HASH = "0c558bf03b8d064986d82c8bd8977cf2d9966988182e82fe81f3356dfc9a3f0459f734b6a7d1e3526f12ccf5e4255ca5c9b2d445becdd029bfad619c3248db23"

RPROVIDES:${PN} += "octave-forge-ltfat"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libopenblas.so.0 \
libportaudio.so.2 \
libstdc++.so.6 \
octave-cli"

inherit rpm
