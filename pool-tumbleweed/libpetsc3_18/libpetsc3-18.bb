SUMMARY = "PETSc shared libraries"
DESCRIPTION = "PETSc is a suite of data structures and routines for the scalable \
(parallel) solution of scientific applications modeled by partial \
differential equations."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc3_18-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "e7633a2d785b8bfe8b81c663f3944f07f203ff4025c34ed6e82599b8acce9afdd4b0b0de74c08b6a4c22ef3c789927c80e600fe4fcfcea5dc1da069b01e098be"

RPROVIDES:${PN} += "libpetsc.so.3.18 \
libpetsc3-18"

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
libklu.so.1 \
liblapack.so.3 \
libm.so.6 \
libspqr.so.2 \
libstdc++.so.6 \
libumfpack.so.5"

inherit rpm
