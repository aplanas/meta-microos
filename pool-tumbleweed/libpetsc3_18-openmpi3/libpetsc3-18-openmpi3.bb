SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc3_18-openmpi3-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "60408daf841f1c4c4f920943d0fe7857e1ddc207a3b7f3d98c203c3ccb205f330bf4548aadee10be8fc3ad5092ec23228526a5d3d1d3d87c15a3aa65598c9b99"

RPROVIDES:${PN} += "libpetsc.so.3.18 \
libpetsc3-18-openmpi3"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/python3 \
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
libmpi-mpifh.so.40 \
libmpi.so.40 \
libptscotch.so.0 \
libptscotcherrexit.so.0 \
libptscotchparmetis.so.0 \
libscalapack.so.2.1.0 \
libspqr.so.2 \
libstdc++.so.6 \
libumfpack.so.5"

inherit rpm
