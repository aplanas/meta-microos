SUMMARY = "Computer-Aided Control System Design (CACSD) Tools"
DESCRIPTION = "Computer-Aided Control System Design (CACSD) Tools for GNU Octave, based \
on the proven SLICOT Library. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.0"

RPM_NAME = "octave-forge-control-3.4.0-1.10.aarch64.rpm"
RPM_HASH = "9226db0a7723693ef18210d6d1db5c298511febf73bbd4c4538f4b7180af9319dc356f20cd49c5f463cc87ddbb1bd98af788655ef59839fd33c8de910ff2ceee"

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
