SUMMARY = "Molecular Dynamics Package"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations and subsequent trajectory analysis. It is developed for \
biomolecules like proteins, but it can be used in several other field \
like polymer chemistry and solid state physics."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "gromacs-2023-1.1.aarch64.rpm"
RPM_HASH = "b93fd0c6c3090bb69df5ec577f4eb9100a42d33e026bd6dbe96b47db6b388c7a616bf8161b0c8ec1ebce380cb58d1be28bb0bd52a2e2ad0bafe2f2fba86b8c5f"

RPROVIDES:${PN} += "gromacs"

RDEPENDS:${PN} += "/usr/bin/perl \
gromacs-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgromacs.so.8 \
libstdc++.so.6"

inherit rpm
