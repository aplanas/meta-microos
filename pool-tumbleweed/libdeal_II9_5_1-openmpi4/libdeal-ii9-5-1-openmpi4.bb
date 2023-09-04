SUMMARY = "A generic C++ finite element library"
DESCRIPTION = "deal.II is a C++ program library targeted at the computational solution of \
partial differential equations using adaptive finite elements. \
 \
This package provides the shared library for deal.II."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.1"

RPM_NAME = "libdeal_II9_5_1-openmpi4-9.5.1-1.1.aarch64.rpm"
RPM_HASH = "ab587d2d55a01a51b0218b22a7924dd0ced983258c0fb19a4b84287c51dabf5457944f9008ac823bf2ebe4f1d132b457e12089a767c39c8ab9cf55c34cec67ea"

RPROVIDES:${PN} += "libdeal-II.so.9.5.1 \
libdeal-II9-5-1-openmpi4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-iostreams.so.1.82.0 \
libboost-serialization.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgmsh.so.4.11 \
libgomp.so.1 \
libgsl.so.27 \
libgslcblas.so.0 \
libhdf5.so.200 \
libkokkoscore.so.4.1 \
libm.so.6 \
libmetis.so.5 \
libmpi.so.40 \
libmuparser.so.2.3.4 \
libopenblas.so.0 \
libscalapack.so.2.1.0 \
libstdc++.so.6 \
libtbb.so.12 \
libumfpack.so.5 \
libz.so.1"

inherit rpm
