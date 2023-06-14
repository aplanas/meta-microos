SUMMARY = "Devel files for petsc"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "petsc_3_18_5-gnu-openmpi1-hpc-devel-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "0f4822880a79857ad6457e1fb97d5c4b1989a0f91fed8b5a08b7a27e2b5ffdd92e219cbbc1909318bc9afc67d6ee0c69af580c56d289287d6e9f3c69c186ce0f"

RPROVIDES:${PN} += "petsc-3-18-5-gnu-openmpi1-hpc-devel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
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
