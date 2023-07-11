SUMMARY = "Header files for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the source and header files required for \
developing with HepMC."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "HepMC-devel-3.2.5-2.6.aarch64.rpm"
RPM_HASH = "292d3421e60826b1738e9ffa05c97f78ada611c5a1e6464c8d553ea8f4c267334cd224adf599330d393f774a32d5e4b085079173686db50828c7e0c9d9abfd3d"

RPROVIDES:${PN} += "HepMC-devel \
HepMC3-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
libHepMC3-3 \
libHepMC3search4"

inherit rpm
