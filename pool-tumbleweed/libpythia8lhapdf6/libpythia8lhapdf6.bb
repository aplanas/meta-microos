SUMMARY = "LHAPDF bindings for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. \
 \
This package provides the shared libraries for the lhapdf6 bindings of \
pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.307"

RPM_NAME = "libpythia8lhapdf6-8.307-1.14.aarch64.rpm"
RPM_HASH = "85b48f7a12b867eec51ed32c36d0a751e5fa728d55a63c032c1eb0e529c3dd0778765ea98fab03276ec62216e2f103ebc7ebc5e6dd7a41c20d6381ef2dbe556f"

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
