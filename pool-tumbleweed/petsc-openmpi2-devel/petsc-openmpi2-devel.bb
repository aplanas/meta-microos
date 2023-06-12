SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-openmpi2-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "3d3d6a710e0f2960b7af3bb19544b44480bd181900d0a52f41c9c4d9659163691ffd10b6c1e68ee80745d555505e8f0ada3ade610271a91797d8a87de6b06ad8"

RPROVIDES:${PN} += "petsc-openmpi2-devel \
petsc-openmpi2-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
/usr/bin/sh \
Modules \
blacs-openmpi2-devel \
hdf5-openmpi2-devel \
hypre-openmpi2-devel \
libpetsc3_18-openmpi2 \
ptscotch-openmpi2-devel \
ptscotch-parmetis-openmpi2-devel \
scalapack-openmpi2-devel \
suitesparse-devel"

inherit rpm
