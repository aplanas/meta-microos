SUMMARY = "A generic C++ finite element library"
DESCRIPTION = "deal.II is a C++ program library targeted at the computational solution of \
partial differential equations using adaptive finite elements. \
 \
This package provides the shared library for deal.II."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.1"

RPM_NAME = "libdeal_II9_5_1-openmpi2-9.5.1-1.1.aarch64.rpm"
RPM_HASH = "4798a394fc108a926d5ea1d379dc41e8cb2756a2d113d46ff09fbba0a1ac44431f16dee5624a4cbd3dc0b1711ce87f9cdd40f0e6e0d6fb1a24e743bb85a8ea37"

RPROVIDES:${PN} += "libdeal-II.so.9.5.1 \
libdeal-II9-5-1-openmpi2"

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
libmpi.so.20 \
libmuparser.so.2.3.4 \
libopenblas.so.0 \
libscalapack.so.2.1.0 \
libstdc++.so.6 \
libtbb.so.12 \
libumfpack.so.5 \
libz.so.1"

inherit rpm
