SUMMARY = "An event record for High Energy Physics Monte Carlo Generators in C++"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "python311-HepMC-3.2.5-2.5.aarch64.rpm"
RPM_HASH = "5b5c67ebdecdefef8624f9cc1927a809404e08216814b1ba79502c3a9545a97de52e5b838f8ff61dc1edc329213aeac957918f4cb516d3ec06de059a6b5028a3"

RPROVIDES:${PN} += "python3.11dist-pyhepmc3 \
python3.11dist-pyhepmc3.search \
python311-HepMC \
python3dist-pyhepmc3 \
python3dist-pyhepmc3.search"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHepMC3.so.3 \
libHepMC3search.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
