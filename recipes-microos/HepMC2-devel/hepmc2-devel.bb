SUMMARY = "Header files for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the source and header files required for \
developng with HepMC."
LICENSE = "GPL-2.0-only"

PV = "2.06.11"

RPM_NAME = "HepMC2-devel-2.06.11-2.9.aarch64.rpm"
RPM_HASH = "750d2504a1b1ac930428295103679d671409c9ffb5f40fe050a39a5dcbe8b8f4415488ba7ebff0dfcdcb251a66f4fdf437e965d5b1660c8cf2d44fbeece90bd8"

RPROVIDES:${PN} += "HepMC2-devel HepMC2-devel(aarch-64)"
RDEPENDS:${PN} += "libHepMC4"

inherit rpm
