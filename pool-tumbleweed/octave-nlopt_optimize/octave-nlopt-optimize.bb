SUMMARY = "Octave interface to nonlinear optimization libray"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms. \
 \
This package contains the Octave interface for NLopt."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "octave-nlopt_optimize-2.7.1-3.16.aarch64.rpm"
RPM_HASH = "f59dce154dda400d8971f0b3bba750207bf2b505510b399856320dc5a88564eaa12c443a4acfe682717ef8c81603bc9b98cdc46537d9cf7823e1bb11677d68ab"

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
