SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-mpich-hpc-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "9de350f70cd9764fdb3db01bacae616adc8faf688a11876ce89a731ffca049305b1a08f565a794441f1ecf24da0db990b2a7b8c1ca931a3d5eb582297f465c16"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
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
