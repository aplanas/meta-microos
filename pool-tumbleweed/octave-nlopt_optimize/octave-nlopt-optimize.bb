SUMMARY = "Octave interface to nonlinear optimization libray"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms. \
 \
This package contains the Octave interface for NLopt."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "octave-nlopt_optimize-2.7.1-3.14.aarch64.rpm"
RPM_HASH = "2e5b832eeb7218e3f46a40d3bc7d4c69c1c2f2b7971477cbab7683f1bcba7626d8efa3e087a79fe6f59bf6f26a943bde12546d4d1a0ad5b3366a847dc314a13c"

RPROVIDES:${PN} += "octave-nlopt_optimize \
octave-nlopt_optimize(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libnlopt.so.0()(64bit) \
liboctave.so.10()(64bit) \
liboctinterp.so.11()(64bit) \
libstdc++.so.6()(64bit) \
octave-cli"

inherit rpm
