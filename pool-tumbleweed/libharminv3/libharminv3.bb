SUMMARY = "Library for solving the problem of harmonic inversion"
DESCRIPTION = "Harminv is library to solve the problem of harmonic inversion — given \
a discrete-time, finite-length signal that consists of a sum of \
finitely-many sinusoids (possibly exponentially decaying) in a given \
bandwidth, it determines the frequencies, decay constants, amplitudes, \
and phases of those sinusoids."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "libharminv3-1.4.1-1.19.aarch64.rpm"
RPM_HASH = "7a2471ee53ad78bfb58cca521943ed6399f6f72b3f910a5629bc71e2794573ffa057864280ca008c0a18f6c57b76c4e201933e07ffc8c0a19f0a4e7f2c4ccc4c"

RPROVIDES:${PN} += "libharminv.so.3 \
libharminv3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
liblapack.so.3 \
libm.so.6"

inherit rpm
