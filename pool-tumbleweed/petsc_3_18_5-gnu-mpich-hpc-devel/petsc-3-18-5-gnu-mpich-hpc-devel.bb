SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-mpich-hpc-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "d035b94a883111e2bb99bce1a52cd2e58f0c1b4ace01298b732fdb91675d53b69edb2258092a6905766c930ba15e33c3986601b90f13c013ff82ea05ec8a21f5"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-mpich-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libpetsc-3-18-5-gnu-mpich-hpc \
libscalapack2-gnu-mpich-hpc-devel \
libstdc++.so.6 \
mpich-gnu-hpc-devel"

inherit rpm
