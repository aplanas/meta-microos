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

PV = "8.310"

RPM_NAME = "libpythia8-8.310-1.1.aarch64.rpm"
RPM_HASH = "416f08bb64f9901f2707adfd953116048e2447736cd4af0d2aee529a1e7d2bf523f827cc77f6fa485395dc7f9ddde78208cd40d52e1fe4f0f0c2eadbc3623b63"

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
