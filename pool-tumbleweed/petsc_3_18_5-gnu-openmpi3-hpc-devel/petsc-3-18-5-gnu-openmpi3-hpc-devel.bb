SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi3-hpc-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "bdda990941979749aac33fd9f082970c60e7392d3c5a43d5732944880ff80bb631cf41afb87b41e738f3adaf6cdd52f1d2b4cee0420b53bc715ca3cf7a5d125b"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
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
