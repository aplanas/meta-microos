SUMMARY = "Octave interface to nonlinear optimization libray"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms. \
 \
This package contains the Octave interface for NLopt."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "octave-nlopt_optimize-2.7.1-3.15.aarch64.rpm"
RPM_HASH = "8e6b34e11c0999e9c9caa658b4c5feab630f3209187d1a2d2f5eeb864b5edcb189e5940e3a1faaf57014fc364d83396db733ba9ebdea6c96006919f817f43e69"

RPROVIDES:${PN} += "octave-nlopt-optimize"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnlopt.so.0 \
liboctave.so.10 \
liboctinterp.so.11 \
libstdc++.so.6 \
octave-cli"

inherit rpm
