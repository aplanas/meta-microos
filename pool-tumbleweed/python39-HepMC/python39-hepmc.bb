SUMMARY = "An event record for High Energy Physics Monte Carlo Generators in C++"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "python39-HepMC-3.2.5-2.5.aarch64.rpm"
RPM_HASH = "1d15303ee9a20b2af7557f9fb74e90721275c8c1043f634afb05c6afa63e6a6bd2cd70132f0ff15b9058614f721b93df03d6a391ae5509621e7a0fb62547f211"

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
