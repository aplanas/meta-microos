SUMMARY = "Shared library for HepMC search"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the shared library for HepMC3 searches."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "libHepMC3search4-3.2.5-2.6.aarch64.rpm"
RPM_HASH = "aa1d93b624d0ba877faae3153d5ac93c88d9ffcf413b031f4340d38aef6c655ec61b9a0f0d45e5f7b530eb4ee612f2ddafbbf7620a2d79db70b4380a6f757e54"

RPROVIDES:${PN} += "libHepMC3search.so.4 \
libHepMC3search4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHepMC3.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
