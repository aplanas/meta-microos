SUMMARY = "A generic C++ finite element library"
DESCRIPTION = "deal.II is a C++ program library targeted at the computational solution of \
partial differential equations using adaptive finite elements. \
 \
This package provides the shared library for deal.II."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "libdeal_II9_4_2-openmpi2-9.4.2-1.5.aarch64.rpm"
RPM_HASH = "45660c35f15cc16e250ebe65641f2bdda3fb7d2ec0f226ad3e9c75bdef9eb76d77a056df8e38cb1b56b67a4c41a280310d0becbeb183e9bc686df47a7387b3f6"

RPROVIDES:${PN} += "libdeal-II.so.9.4.2 \
libdeal-II9-4-2-openmpi2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-iostreams.so.1.82.0 \
libboost-serialization.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgmsh.so.4.11 \
libgsl.so.27 \
libgslcblas.so.0 \
libhdf5.so.200 \
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
