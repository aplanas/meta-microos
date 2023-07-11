SUMMARY = "Nonlinear Time Series Analysis"
DESCRIPTION = "TISEAN stands for TIme SEries ANalysis. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "octave-forge-tisean-0.2.3-2.2.aarch64.rpm"
RPM_HASH = "45263c0cf761f6c6bcc1b5a81e3e5fb46cbf0b8f31c6eb2cdbc747c8bc10e1fe7eb59cc64d471b8fe1cd95c4a2e07b820cbd67c7fe7f87567666b3d323e88f6b"

RPROVIDES:${PN} += "octave-forge-tisean"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli \
octave-forge-signal"

inherit rpm
