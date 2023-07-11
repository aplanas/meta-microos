SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-mvapich2-hpc-devel-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "e83101c0a1b02f104462d627447b90c17541d0abb457fb159d8de3b3ca9a381655f178acddbd10eb0dcdb0b3358d85cc50f0d6a2efd2d96dbd3b260fc802c1f9"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
gnu-compilers-hpc-devel \
hdf5-gnu-mvapich2-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libpetsc-3-18-5-gnu-mvapich2-hpc \
libscalapack2-gnu-mvapich2-hpc-devel \
libstdc++.so.6 \
mvapich2-gnu-hpc-devel"

inherit rpm
