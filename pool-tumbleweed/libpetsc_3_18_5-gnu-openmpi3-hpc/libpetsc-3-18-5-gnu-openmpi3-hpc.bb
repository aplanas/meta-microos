SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc_3_18_5-gnu-openmpi3-hpc-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "f6ac227fc877df9a827b5bf64346e7dcef9a0bf326b891e9e803b34fbde3d9dab9ab7adeaf6545af6ab5295fca87d96eb782fb011957447d9e20af6624a2b231"

RPROVIDES:${PN} += "libpetsc_3_18_5-gnu-openmpi3-hpc \
libpetsc_3_18_5-gnu-openmpi3-hpc(aarch-64)"

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
libopenmpi3-gnu-hpc \
libstdc++.so.6()(64bit) \
lua-lmod"

inherit rpm
