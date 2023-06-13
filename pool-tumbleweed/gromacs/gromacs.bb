SUMMARY = "Molecular Dynamics Package"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations and subsequent trajectory analysis. It is developed for \
biomolecules like proteins, but it can be used in several other field \
like polymer chemistry and solid state physics."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "gromacs-2023-1.1.aarch64.rpm"
RPM_HASH = "b93fd0c6c3090bb69df5ec577f4eb9100a42d33e026bd6dbe96b47db6b388c7a616bf8161b0c8ec1ebce380cb58d1be28bb0bd52a2e2ad0bafe2f2fba86b8c5f"

RPROVIDES:${PN} += "gromacs \
gromacs(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
gromacs-data \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgromacs.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
