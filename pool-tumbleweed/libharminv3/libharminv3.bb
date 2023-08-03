SUMMARY = "Library for solving the problem of harmonic inversion"
DESCRIPTION = "Harminv is library to solve the problem of harmonic inversion — given \
a discrete-time, finite-length signal that consists of a sum of \
finitely-many sinusoids (possibly exponentially decaying) in a given \
bandwidth, it determines the frequencies, decay constants, amplitudes, \
and phases of those sinusoids."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.2"

RPM_NAME = "libharminv3-1.4.2-1.1.aarch64.rpm"
RPM_HASH = "e5170e89dd01526e459140fab1c5bf8e140f5fa395d0a990ea68721f59a64f396d673fbcd05296433980d08a0f0a09e2266b2e08ab2075b199db51033c09aba3"

RPROVIDES:${PN} += "libharminv.so.3 \
libharminv3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
liblapack.so.3 \
libm.so.6"

inherit rpm
