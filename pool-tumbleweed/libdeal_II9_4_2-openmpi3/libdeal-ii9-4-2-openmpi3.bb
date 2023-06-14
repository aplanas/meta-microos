SUMMARY = "A generic C++ finite element library"
DESCRIPTION = "deal.II is a C++ program library targeted at the computational solution of \
partial differential equations using adaptive finite elements. \
 \
This package provides the shared library for deal.II."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "libdeal_II9_4_2-openmpi3-9.4.2-1.4.aarch64.rpm"
RPM_HASH = "e5fae390e52ece43ec01dd34cbb2d72533dc87cc38e81ad1893e2e07327913b5148d8245c6bd7fc005ea30e59ed553bf49fc06443860d5bf7747bd1f9a34778c"

RPROVIDES:${PN} += "libdeal-II.so.9.4.2 \
libdeal-II9-4-2-openmpi3"

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
