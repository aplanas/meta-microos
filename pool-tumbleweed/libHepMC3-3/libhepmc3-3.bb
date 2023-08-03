SUMMARY = "Main shared library for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the main shared library for HepMC3."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.2.6"

RPM_NAME = "libHepMC3-3-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "b272394e904aaf182458c6ff0689488994f667c234d6a7f1c4fa5e6963b416dda769ba03ea0e1a979e8b61f77606df5f3f58b342292ca5c0f7fd11f5ab1e588f"

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
