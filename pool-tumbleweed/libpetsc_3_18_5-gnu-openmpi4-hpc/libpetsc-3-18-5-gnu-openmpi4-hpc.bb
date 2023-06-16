SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc_3_18_5-gnu-openmpi4-hpc-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "f3cb5dc0fa036bd8b052ab39fde9b4315e26113c177909087719eccbeed97e4361695d093c995aa3444a0049b46409d3ac03607c184b8667d203275ce16ca22a"

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
