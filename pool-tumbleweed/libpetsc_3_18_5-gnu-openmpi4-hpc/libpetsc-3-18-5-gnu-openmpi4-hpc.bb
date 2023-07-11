SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc_3_18_5-gnu-openmpi4-hpc-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "6a3e9d196b01416f359025d038f69e9586a7739978fc631551b7ca19f7e1f039dd690e5f9bbd6c52a3e8cb5fb3f38a341c073cc5002c303f754e90d84adac0e6"

RPROVIDES:${PN} += "libpetsc-3-18-5-gnu-openmpi4-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
/usr/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenmpi4-gnu-hpc \
libstdc++.so.6 \
lua-lmod"

inherit rpm
