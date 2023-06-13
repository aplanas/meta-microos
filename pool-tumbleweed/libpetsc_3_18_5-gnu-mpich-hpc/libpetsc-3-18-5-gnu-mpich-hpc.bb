SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc_3_18_5-gnu-mpich-hpc-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "eefab99b496419dc95b3677386f437ed061b5536694b7021b629dbcc5043ee3e8a08a2a4a80fc231d491d2e9102f9a5f852d761ecc97c21142b73de87bd5339c"

RPROVIDES:${PN} += "libpetsc_3_18_5-gnu-mpich-hpc \
libpetsc_3_18_5-gnu-mpich-hpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/python3 \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_10)(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
lua-lmod \
mpich-gnu-hpc"

inherit rpm
