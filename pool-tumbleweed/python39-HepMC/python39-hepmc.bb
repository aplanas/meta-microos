SUMMARY = "An event record for High Energy Physics Monte Carlo Generators in C++"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.2.6"

RPM_NAME = "python39-HepMC-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "ee338b366b2360f3af1bed9047c4cb0a1a473853e45cc30efd8220a91a9251c3c089b60f632fe64a41efe81187c3b61e25c85593f21639bb076e8650d0bbe9a6"

RPROVIDES:${PN} += "python3.9dist-pyhepmc3 \
python3.9dist-pyhepmc3.search \
python39-HepMC \
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
