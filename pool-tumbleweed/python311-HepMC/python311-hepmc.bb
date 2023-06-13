SUMMARY = "An event record for High Energy Physics Monte Carlo Generators in C++"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "python311-HepMC-3.2.5-2.5.aarch64.rpm"
RPM_HASH = "5b5c67ebdecdefef8624f9cc1927a809404e08216814b1ba79502c3a9545a97de52e5b838f8ff61dc1edc329213aeac957918f4cb516d3ec06de059a6b5028a3"

RPROVIDES:${PN} += "python3.11dist(pyhepmc3) \
python3.11dist(pyhepmc3.search) \
python311-HepMC \
python311-HepMC(aarch-64) \
python3dist(pyhepmc3) \
python3dist(pyhepmc3.search)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libHepMC3.so.3()(64bit) \
libHepMC3search.so.4()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
