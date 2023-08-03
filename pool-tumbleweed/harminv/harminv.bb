SUMMARY = "Solver for the problem of harmonic inversion"
DESCRIPTION = "Harminv is a program to solve the problem of harmonic inversion — given \
a discrete-time, finite-length signal that consists of a sum of \
finitely-many sinusoids (possibly exponentially decaying) in a given \
bandwidth, it determines the frequencies, decay constants, amplitudes, \
and phases of those sinusoids."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.2"

RPM_NAME = "harminv-1.4.2-1.1.aarch64.rpm"
RPM_HASH = "24192d528a9377f9ebaa2739e45d851050a12d517e07b987f844bdfebc35bd79eb6900ef43e3d5a415eb6b9e7226e15812d92ed412359c63a8a37979c8406270"

RPROVIDES:${PN} += "harminv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libharminv.so.3 \
libm.so.6"

inherit rpm
