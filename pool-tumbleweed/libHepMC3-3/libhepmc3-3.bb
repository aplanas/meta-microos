SUMMARY = "Main shared library for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the main shared library for HepMC3."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "libHepMC3-3-3.2.5-2.5.aarch64.rpm"
RPM_HASH = "e9c493b87bc5a5947609680c645a6ecb8523b8dae1b79159305d90977fd37a407acd3dd61224c1924543fd33a53f9c99a824f6c328b27eed285aca49b1e80651"

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
