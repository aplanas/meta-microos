SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-openmpi3-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "6e3899c27573bc40a21371918d24bef44a3baa95931ee0ac3fed1fed21b72d9464360e02f55e1865d6918d0ca00822a900e11a40d1bc4886caab95d57545681e"

RPROVIDES:${PN} += "petsc-openmpi3-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
Modules \
blacs-openmpi3-devel \
hdf5-openmpi3-devel \
hypre-openmpi3-devel \
libpetsc3-18-openmpi3 \
ptscotch-openmpi3-devel \
ptscotch-parmetis-openmpi3-devel \
scalapack-openmpi3-devel \
suitesparse-devel"

inherit rpm
