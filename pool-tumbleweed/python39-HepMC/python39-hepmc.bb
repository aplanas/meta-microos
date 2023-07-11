SUMMARY = "An event record for High Energy Physics Monte Carlo Generators in C++"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "python39-HepMC-3.2.5-2.6.aarch64.rpm"
RPM_HASH = "e1efe6ea9c12c12b6d18abcf93965467f33425223bd80eb50fa9aed5611da302c615bedfce9f9e417b49b2c59e856df1deb246c90d5845202d10919115469924"

RPROVIDES:${PN} += "python3.9dist-pyhepmc3 \
python3.9dist-pyhepmc3.search \
python39-HepMC \
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
