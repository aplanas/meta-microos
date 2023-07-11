SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc_3_18_5-gnu-openmpi1-hpc-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "282c5f78255ac2c0b56e6c23d7292fadeca97d5f7f3c3c8eb29d73a15e665c8fa63f4aed895cf4fb87c22f1a5935fb06be3f43c30a119368bacf7ddc13b2bccb"

RPROVIDES:${PN} += "libpetsc-3-18-5-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenmpi1-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
