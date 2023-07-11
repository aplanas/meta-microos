SUMMARY = "Molecular Dynamics Package"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations and subsequent trajectory analysis. It is developed for \
biomolecules like proteins, but it can be used in several other field \
like polymer chemistry and solid state physics."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "gromacs-2023-1.2.aarch64.rpm"
RPM_HASH = "9355e6d2e8b7d2289a3f96e784be035dbcf6c1abb623d6b9388d5581a84d9caabeea20063c60d751b4b3babbc212c3398c95dcdaa276d22357fbce0279739e59"

RPROVIDES:${PN} += "gromacs"

RDEPENDS:${PN} += "/usr/bin/perl \
gromacs-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgromacs.so.8 \
libstdc++.so.6"

inherit rpm
