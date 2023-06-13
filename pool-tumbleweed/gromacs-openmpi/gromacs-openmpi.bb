SUMMARY = "Molecular Dynamics Package"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations and subsequent trajectory analysis. It is developed for \
biomolecules like proteins, but it can be used in several other field \
like polymer chemistry and solid state physics."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "gromacs-openmpi-2023-1.1.aarch64.rpm"
RPM_HASH = "693995b32d13cfab6f277f7c1a8d03ad01f80ae672fb5a77449add5e0922ea8d6b688970f8fe565ed0155a1220bc9e5da058c5a41a52c7524e7ab36156f8130b"

RPROVIDES:${PN} += "gromacs-openmpi \
gromacs-openmpi(aarch-64)"

RDEPENDS:${PN} += "gromacs-data \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgromacs_mpi.so.8()(64bit) \
libmpi.so.40()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
