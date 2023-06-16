SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc3_18-openmpi2-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "df7b68d8f0a80c601e9f3017036e884af4a9b7ac2d8d5053bd0e4c980334d70d9ec631a57af07c04910e769be747b8751a3091fe137a4a3c44e8c1c48cca515d"

RPROVIDES:${PN} += "libpetsc.so.3.18 \
libpetsc3-18-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libamd.so.2 \
libblas.so.3 \
libc.so.6 \
libcholmod.so.3 \
libgcc-s.so.1 \
libgfortran.so.5 \
libhdf5.so.200 \
libklu.so.1 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.20 \
libmpi.so.20 \
libptscotch.so.0 \
libptscotcherrexit.so.0 \
libptscotchparmetis.so.0 \
libscalapack.so.2.1.0 \
libspqr.so.2 \
libstdc++.so.6 \
libumfpack.so.5"

inherit rpm
