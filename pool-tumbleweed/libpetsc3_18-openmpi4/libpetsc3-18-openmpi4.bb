SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc3_18-openmpi4-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "5fe2cea124d9c0356f5704f0cef9928d305ccc8084df1c431fcb9ee545eaa29be4ddb29d6fef5ca091e93033764dc58f9be0f96e4514d83f0e7536907a61772f"

RPROVIDES:${PN} += "libpetsc.so.3.18 \
libpetsc3-18-openmpi4"

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
