SUMMARY = "Computer-Aided Control System Design (CACSD) Tools"
DESCRIPTION = "Computer-Aided Control System Design (CACSD) Tools for GNU Octave, based \
on the proven SLICOT Library. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.0"

RPM_NAME = "octave-forge-control-3.4.0-1.9.aarch64.rpm"
RPM_HASH = "9021733730693f05e448280edb6d68d7ebf54cd272d5b43e3438a3b6a60c2ca030abe77e3720008b78be32c49f6e014462e464415493f5e55b8309fa1c0fa7db"

RPROVIDES:${PN} += "octave-forge-control"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
octave-cli"

inherit rpm
