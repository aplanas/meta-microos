SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi4-hpc-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "5e54fbfd4f725d638cb036256f4df9634984269a6616edc784751525adf77cd7a3dbc50172a80d834b742531e465889629e5fc7a24655a3169497aea5fef4386"

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
