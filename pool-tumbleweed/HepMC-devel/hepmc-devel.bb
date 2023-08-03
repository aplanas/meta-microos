SUMMARY = "Header files for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the source and header files required for \
developing with HepMC."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.2.6"

RPM_NAME = "HepMC-devel-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "a751e19f99790174972f58ab10152a05638d07e12d848c46f5e1d171cd533c87d296a4c96e45dcc38a5145a86f53be1b92ab0694b4869d3923867fe8db516a46"

RPROVIDES:${PN} += "HepMC-devel \
HepMC3-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
libHepMC3-3 \
libHepMC3search5"

inherit rpm
