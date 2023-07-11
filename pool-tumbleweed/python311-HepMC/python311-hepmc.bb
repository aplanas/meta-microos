SUMMARY = "An event record for High Energy Physics Monte Carlo Generators in C++"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "python311-HepMC-3.2.5-2.6.aarch64.rpm"
RPM_HASH = "72ab30d45723fef460d4a0b8348a3fbc4fd0f68cddae537d0a17a5fcec96e33a1f7661a0d5a96034bb6fbd8cadcbe0a9a1641c4446c47613e3a0077918976ce2"

RPROVIDES:${PN} += "python3-HepMC \
python3.11dist-pyhepmc3 \
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
