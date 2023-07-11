SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi1-hpc-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "7c616dcdaba9a085ff17d534c2ca8d84e15cb0bfd60a4e4b9a430fceb1546c2e6f4e72a13ccc5b66596bcf4b883e1a58f47e0e0b4eff4e8e1eac9ba4ab7f7b1a"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi1-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libpetsc-3-18-5-gnu-openmpi1-hpc \
libscalapack2-gnu-openmpi1-hpc-devel \
libstdc++.so.6 \
openmpi1-gnu-hpc-devel"

inherit rpm
