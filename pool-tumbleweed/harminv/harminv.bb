SUMMARY = "Solver for the problem of harmonic inversion"
DESCRIPTION = "Harminv is a program to solve the problem of harmonic inversion — given \
a discrete-time, finite-length signal that consists of a sum of \
finitely-many sinusoids (possibly exponentially decaying) in a given \
bandwidth, it determines the frequencies, decay constants, amplitudes, \
and phases of those sinusoids."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "harminv-1.4.1-1.19.aarch64.rpm"
RPM_HASH = "5d4856e5d1d03811c2183148793e96507d96f4560e64f49a9b2dc3366bc732da7a5d890e9a14d1acbc6d31fcb7986f862e1b24537612c6ffc75d1d5bb3d69cfb"

RPROVIDES:${PN} += "harminv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libharminv.so.3 \
libm.so.6"

inherit rpm
