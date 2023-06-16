SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi2-hpc-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "4e7c24491ea76e8d87bdc53bb562591157080328f53ecea6a1588972b0c997e28e36eaa99094532a80e5a80caf5aa0772efb0a8f4e9969f2b5c1b865cc908014"

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
