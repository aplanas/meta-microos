SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-openmpi4-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "0d491506b8ed3acbb1f8409adfc6b65f33adcdc387053c3ba3daf04afda4077480a1f4b6c674c1d16a54e490a01991f0bd60db34d3e2b18139d09ec3d45949a4"

RPROVIDES:${PN} += "petsc-openmpi4-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
Modules \
blacs-openmpi4-devel \
hdf5-openmpi4-devel \
hypre-openmpi4-devel \
libpetsc3-18-openmpi4 \
ptscotch-openmpi4-devel \
ptscotch-parmetis-openmpi4-devel \
scalapack-openmpi4-devel \
suitesparse-devel"

inherit rpm
