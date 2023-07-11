SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi4-hpc-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "79172868359edd096406bc2e492e63a45045a4add1cbd8639b48ba40544a04eb8b37d8fabb9300a61d865b79234c5547cb3c2b84565b831608f2ff136339700a"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-openmpi4-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi4-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libpetsc-3-18-5-gnu-openmpi4-hpc \
libscalapack2-gnu-openmpi4-hpc-devel \
libstdc++.so.6 \
openmpi4-gnu-hpc-devel"

inherit rpm
