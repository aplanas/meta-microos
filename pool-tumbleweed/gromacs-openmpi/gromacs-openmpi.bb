SUMMARY = "Molecular Dynamics Package"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations and subsequent trajectory analysis. It is developed for \
biomolecules like proteins, but it can be used in several other field \
like polymer chemistry and solid state physics."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "gromacs-openmpi-2023-1.2.aarch64.rpm"
RPM_HASH = "a5153c4449c47e9633b3428607cc7a9cc703d3afb4bfc3e1440869ffd928da6a85a9905ba04aba66aa2f74bb8d17148784bdce0795998597220e854d312e1214"

RPROVIDES:${PN} += "gromacs-openmpi"

RDEPENDS:${PN} += "gromacs-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgromacs-mpi.so.8 \
libmpi.so.40 \
libstdc++.so.6"

inherit rpm
