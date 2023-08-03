SUMMARY = "An event record for High Energy Physics Monte Carlo Generators in C++"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.2.6"

RPM_NAME = "python310-HepMC-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "99b266797d5b8c5df29fc7cae99345e9262a910d10b843cd03cf9a05d1c377634be56d6c4a02eb1e74aedbef0693c2550fe07029330c0bea5e7a6e7ef3e91897"

RPROVIDES:${PN} += "python3.10dist-pyhepmc3 \
python3.10dist-pyhepmc3.search \
python310-HepMC \
python3dist-pyhepmc3 \
python3dist-pyhepmc3.search"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libHepMC3.so.3 \
libHepMC3search.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
