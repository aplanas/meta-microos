SUMMARY = "An event record for High Energy Physics Monte Carlo Generators in C++"
DESCRIPTION = "The HepMC package is an object oriented event record written in C++ \
for High Energy Physics Monte Carlo Generators. Many extensions from \
HEPEVT, the Fortran HEP standard, are supported."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "python310-HepMC-3.2.5-2.6.aarch64.rpm"
RPM_HASH = "742f40ada0a9bc443b5a6a11d0c463499f2cd0f01333f374523d76eb314c58b0e9536e1cfe61f86d94b8d2f66b48a5fac8f771f7b4beed2277c5c9dadcfb4a32"

RPROVIDES:${PN} += "python3.10dist-pyhepmc3 \
python3.10dist-pyhepmc3.search \
python310-HepMC \
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
