SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc3_18-openmpi4-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "03415a60053606d7303be38b2021e1993e6287342308dab05749cd8343a902ce62d7f1a6ae6f61d6b8628b10cacae344e6e419c41f62f63ce221a7d8b153a39b"

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
