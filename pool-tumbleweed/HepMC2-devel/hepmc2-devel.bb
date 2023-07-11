SUMMARY = "Header files for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the source and header files required for \
developng with HepMC."
LICENSE = "GPL-2.0-only"

PV = "2.06.11"

RPM_NAME = "HepMC2-devel-2.06.11-2.10.aarch64.rpm"
RPM_HASH = "362b848709d812633a4ead2644f0ff8bfa825adba4ffbef256f00f759ca72b53229a04f205f87485654345c53890f32596ac0f8837cd391829dff9690e243ee2"

RPROVIDES:${PN} += "HepMC2-devel"

RDEPENDS:${PN} += "libHepMC4"

inherit rpm
