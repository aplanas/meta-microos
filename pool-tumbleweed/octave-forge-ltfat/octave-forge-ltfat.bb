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

RPM_NAME = "octave-forge-ltfat-2.5.0-1.5.aarch64.rpm"
RPM_HASH = "39215450c6ca53693a58e0e69c67a057663e667ac2c31a60ffb651b6c9dfa505de1b29a31794d0dd17af5339dbc02c3c6af3e246ce933d1ff7f7e7c291664791"

RPROVIDES:${PN} += "octave-forge-ltfat"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
