SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc_3_18_5-gnu-openmpi4-hpc-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "f3cb5dc0fa036bd8b052ab39fde9b4315e26113c177909087719eccbeed97e4361695d093c995aa3444a0049b46409d3ac03607c184b8667d203275ce16ca22a"

RPROVIDES:${PN} += "libpetsc_3_18_5-gnu-openmpi4-hpc \
libpetsc_3_18_5-gnu-openmpi4-hpc(aarch-64)"

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
libopenmpi4-gnu-hpc \
libstdc++.so.6()(64bit) \
lua-lmod"

inherit rpm
