SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc_3_18_5-gnu-mvapich2-hpc-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "f6ac0944b301ff03e3b89eff74bc4181cdbe2c8a11391534299af82da6d97b3f106991cb11c3cda62a04105cdfccb8bab9f8c33d1dec1a0093dcc277dfc9aa94"

RPROVIDES:${PN} += "libpetsc-3-18-5-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libstdc++.so.6 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
