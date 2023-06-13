SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc_3_18_5-gnu-openmpi1-hpc-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "505456ea3fcb46f2da171cbbf29eeb5a434a84c73f0b66410bdde778ef155fe729953012d76f63b902516398b220c5eee57bcf0a84425acd783907aceb5deef2"

RPROVIDES:${PN} += "libpetsc_3_18_5-gnu-openmpi1-hpc \
libpetsc_3_18_5-gnu-openmpi1-hpc(aarch-64)"

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
libopenmpi1-gnu-hpc \
libstdc++.so.6()(64bit) \
lua-lmod"

inherit rpm
