SUMMARY = "Shared library for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. The objective is to provide as accurate as \
possible a representation of event properties in a wide range of \
reactions, within and beyond the Standard Model, with emphasis on \
those where strong interactions play a role, directly or indirectly, \
and therefore multihadronic final states are produced. The physics is \
then not understood well enough to give an exact description; instead \
the program has to be based on a combination of analytical results and \
various QCD-based models. Extensive information is provided on all \
program elements: subroutines and functions, switches and parameters, \
and particle and process data. This should allow the user to tailor \
the generation task to the topics of interest. \
 \
This package provides the shared libraries for pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.307"

RPM_NAME = "libpythia8-8.307-1.15.aarch64.rpm"
RPM_HASH = "239ffb20c4332361bd7d1d615df07b6b2bdc4095334fb22177895be2dd08679880480c0cc7824850ebe5c7e6fb793885ae6fc00c719025c2d119e1cf8724c491"

RPROVIDES:${PN} += "libpythia8 \
libpythia8.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
