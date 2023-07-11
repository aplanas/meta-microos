SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc_3_18_5-gnu-mvapich2-hpc-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "2c3f4390e5d925be8e79aece7a915342516ead2332f45b88c0011a4b7e16fb24cd4c51e2ce069d4cfa9027903dacbefd29bdbb3dfc422317a1996af57e6df2bb"

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
