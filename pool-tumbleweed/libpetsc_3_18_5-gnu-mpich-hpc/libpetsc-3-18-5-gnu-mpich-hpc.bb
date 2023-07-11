SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc_3_18_5-gnu-mpich-hpc-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "3ccfc036fbe7341ec866416e2243a6b67dbe554396df5aa12606322e01af6a2d07d9b7b90779524088f2a84696b6cd260953f481d7d1ac53a5cd50cabf1011f0"

RPROVIDES:${PN} += "libpetsc-3-18-5-gnu-mpich-hpc"

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
mpich-gnu-hpc"

inherit rpm
