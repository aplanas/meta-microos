SUMMARY = "Main shared library for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the main shared library for HepMC3."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "libHepMC3-3-3.2.5-2.6.aarch64.rpm"
RPM_HASH = "7be41eb0178760caea6ec3d9125668ecd054bcfe5bc8356f011066432cb466038b370bb1f9d85648f6902943c4e83f2407a8a3db126dd0df98c44fcd1b5ae5ce"

RPROVIDES:${PN} += "HepMC3 \
libHepMC3-3 \
libHepMC3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
