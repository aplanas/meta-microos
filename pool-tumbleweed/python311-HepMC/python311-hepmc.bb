SUMMARY = "An event record for High Energy Physics Monte Carlo Generators in C++"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "3.2.6"

RPM_NAME = "python311-HepMC-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "74981f7087a3a286e8ea391d61112104cd045e1156a90598389490d0c778bd2bf42816083c36b2e17f2dfee21eb288369e438333132ea4dd4ac2f263f7bffea8"

RPROVIDES:${PN} += "python3-HepMC \
python3.11dist-pyhepmc3 \
python3.11dist-pyhepmc3.search \
python311-HepMC \
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
