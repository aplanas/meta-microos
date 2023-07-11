SUMMARY = "Octave functions for reading and writing FITS files"
DESCRIPTION = "Functions for reading and writing FITS (Flexible Image Transport System) files. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.7"

RPM_NAME = "octave-forge-fits-1.0.7-2.24.aarch64.rpm"
RPM_HASH = "3080a4ed25c2976f629d931a88bfc5c4c3a204112fec1c1086d638091512cfe7415a0bfd6597307cd1d192ff387b3ebaef8313c3c0f5d59a0f649a7d3f216d68"

RPROVIDES:${PN} += "octave-forge-fits"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-cli"

inherit rpm
