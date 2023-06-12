SUMMARY = "Header files for HepMC"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported. \
 \
This package provides the source and header files required for \
developing with HepMC."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "HepMC-devel-3.2.5-2.5.aarch64.rpm"
RPM_HASH = "417c402bd71fd1aed23264b6111fde8ba92cf313d024be1a19de1b8aab6547dac266b18df2259cc897dafea2d78b1c6e35f46a6d690b6a8203a408d217910169"

RPROVIDES:${PN} += "HepMC-devel \
HepMC-devel(aarch-64) \
HepMC3-devel"
RDEPENDS:${PN} += "/bin/bash \
libHepMC3-3 \
libHepMC3search4"

inherit rpm
