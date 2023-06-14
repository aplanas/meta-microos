SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc3_18-3.18.5-1.1.aarch64.rpm"
RPM_HASH = "16bb652ea78871e2fa3e29107824338426ceb37bb20b8d9486979fd66d3a0f4e274173d171af3aadb969c561e4c2ee53845e4713b0dfdb6875329636fd20c484"

RPROVIDES:${PN} += "libpetsc.so.3.18 \
libpetsc3-18"

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
libklu.so.1 \
liblapack.so.3 \
libm.so.6 \
libspqr.so.2 \
libstdc++.so.6 \
libumfpack.so.5"

inherit rpm
