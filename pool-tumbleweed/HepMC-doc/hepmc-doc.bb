SUMMARY = "API documentation for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the API documentation for the HepMC library."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "HepMC-doc-3.2.5-2.6.aarch64.rpm"
RPM_HASH = "6caad78b6bd819662a8885ef6745a8fdfef0995ed12b28dc96b7212249059b6434590a9763ba5f9d56cf4d44503bf9374087f3bdd4ff6926f959e88bab1483a5"

RPROVIDES:${PN} += "HepMC-doc"

RDEPENDS:${PN} += ""

inherit rpm
