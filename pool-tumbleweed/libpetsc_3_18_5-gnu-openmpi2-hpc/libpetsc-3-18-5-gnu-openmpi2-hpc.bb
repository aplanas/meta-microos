SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc_3_18_5-gnu-openmpi2-hpc-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "fb54b54b758d6fea28d1305145efbb7c7c3b7d01d5d1b771675e32b44dd95ca3be7be39e55a77b2cd242436e67733b9e6a0384e3805caf6e021593a4a109bd45"

RPROVIDES:${PN} += "libpetsc-3-18-5-gnu-openmpi2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
/usr/bin/sh \
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
