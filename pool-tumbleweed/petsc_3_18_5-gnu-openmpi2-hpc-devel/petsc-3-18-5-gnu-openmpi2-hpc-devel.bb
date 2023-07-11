SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi2-hpc-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "b4f8b99ef56b8ad18d60d23005906408055c1bc37b903171f345d4ecf329c2ed6a8fb971c056f74acb3bd30eca62af723e1b030b9c8938fd8680c3166c27d86e"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi2-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libpetsc-3-18-5-gnu-openmpi2-hpc \
libscalapack2-gnu-openmpi2-hpc-devel \
libstdc++.so.6 \
openmpi2-gnu-hpc-devel"

inherit rpm
