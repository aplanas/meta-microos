SUMMARY = "A generic C++ finite element library"
DESCRIPTION = "deal.II is a C++ program library targeted at the computational solution of \
partial differential equations using adaptive finite elements. \
 \
This package provides the shared library for deal.II."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "libdeal_II9_4_2-openmpi4-9.4.2-1.4.aarch64.rpm"
RPM_HASH = "333243cc7373bdd1d8f7296abf1a2618e266047737885df159c1dc014ec7f4470c6abf5b1450bc01e4c6db8de26d4d33f328c65f5849178bf46a9eb00c043cfd"

RPROVIDES:${PN} += "libdeal-II.so.9.4.2 \
libdeal-II9-4-2-openmpi4"

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
libmpi.so.40 \
libmuparser.so.2.3.4 \
libopenblas.so.0 \
libscalapack.so.2.1.0 \
libstdc++.so.6 \
libtbb.so.12 \
libumfpack.so.5 \
libz.so.1"

inherit rpm
