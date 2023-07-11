SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi3-hpc-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "f6421a46f101087270916a220bbeaaf65aee718cc501a4498326d75d8ac6766d690fc6a546afcef070f526738d2f830646606db0fcc0096128f6742c0db9d6d4"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-openmpi3-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libpetsc-3-18-5-gnu-openmpi3-hpc \
libscalapack2-gnu-openmpi3-hpc-devel \
libstdc++.so.6 \
openmpi3-gnu-hpc-devel"

inherit rpm
