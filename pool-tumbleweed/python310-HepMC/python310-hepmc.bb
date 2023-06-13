SUMMARY = "An event record for High Energy Physics Monte Carlo Generators in C++"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "python310-HepMC-3.2.5-2.5.aarch64.rpm"
RPM_HASH = "b5a7edcc1e74404c40ef1d0d4fb3e395ca2bf917bb5dadc73e06c2f52688b7a9734cbf83963bf4c1b7c99268c2f86b934d202b4a08fa006d10dda9971feda944"

RPROVIDES:${PN} += "python3-HepMC \
python3.10dist(pyhepmc3) \
python3.10dist(pyhepmc3.search) \
python310-HepMC \
python310-HepMC(aarch-64) \
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
