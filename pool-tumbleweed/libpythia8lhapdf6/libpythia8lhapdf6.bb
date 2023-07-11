SUMMARY = "LHAPDF bindings for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. \
 \
This package provides the shared libraries for the lhapdf6 bindings of \
pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.307"

RPM_NAME = "libpythia8lhapdf6-8.307-1.15.aarch64.rpm"
RPM_HASH = "5cf5b44fbc48c9ac07a685e629e5d67453f92e214f2c2390693c35478223a5a8c41aa148c6bbe6995d264d094a8a1dacd18c299d1f6c3769f3895952966e8f20"

RPROVIDES:${PN} += "libpythia8lhapdf6 \
libpythia8lhapdf6.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLHAPDF-6.5.4.so \
libc.so.6 \
libgcc-s.so.1 \
libpythia8.so \
libstdc++.so.6"

inherit rpm
