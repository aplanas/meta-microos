SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc_3_18_5-gnu-openmpi2-hpc-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "a1694e303016753894e82416d65c7482863b023a2f48487f792cfd64ef38842e716f6779c2ecff56cd0f90e3f17ca00c1abb3d9c6887c2aa41f9e730395aa2f7"

RPROVIDES:${PN} += "libpetsc-3-18-5-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/python3 \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenmpi2-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
