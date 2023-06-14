SUMMARY = "API documentation for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the API documentation for the HepMC library."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "HepMC-doc-3.2.5-2.5.aarch64.rpm"
RPM_HASH = "e5b52d6dc5a0aa3c98535f2daaff040db81cd11a7ee63f08ae5b5979a3f890892fe2915c00bd4f58f8c7ca82edd0ff7f6b50ce4cd603f0a8e6ab4d09ca7a196a"

RPROVIDES:${PN} += "HepMC-doc"

RDEPENDS:${PN} += ""

inherit rpm
