SUMMARY = "LHAPDF bindings for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. \
 \
This package provides the shared libraries for the lhapdf6 bindings of \
pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.310"

RPM_NAME = "libpythia8lhapdf6-8.310-1.1.aarch64.rpm"
RPM_HASH = "a8c623875eba71c487640bf399b0598f3212420228623a2716efa998f6b0ac445d8e58b0c839e100648158ce3ee078b79fa4f4d9ef62708b440cc6b04cab9f10"

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
