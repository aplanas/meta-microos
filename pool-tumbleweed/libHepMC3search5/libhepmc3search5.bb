SUMMARY = "Shared library for HepMC search"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the shared library for HepMC3 searches."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.2.6"

RPM_NAME = "libHepMC3search5-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "96bc060d23de4fbd610015a754c3177a66a6aa2bdf73b8f7d885c66ae179f8aabf838257ffcf36f62be3d4919035dd5243866780aaf65cf3e35777283306aef7"

RPROVIDES:${PN} += "libHepMC3search.so.5 \
libHepMC3search5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libHepMC3.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
