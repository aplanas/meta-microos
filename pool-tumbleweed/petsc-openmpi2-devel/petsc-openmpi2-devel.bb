SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc-openmpi2-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "99ebaae9f56ca62b50b9711686d4c4635a0cbfe9616dc463702880ef9e594bf1a5348ffcf6568ad0a036388a169c8b7cf657850d52f765b9ddb70984a593538e"

RPROVIDES:${PN} += "petsc-openmpi2-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
Modules \
blacs-openmpi2-devel \
hdf5-openmpi2-devel \
hypre-openmpi2-devel \
libpetsc3-18-openmpi2 \
ptscotch-openmpi2-devel \
ptscotch-parmetis-openmpi2-devel \
scalapack-openmpi2-devel \
suitesparse-devel"

inherit rpm
