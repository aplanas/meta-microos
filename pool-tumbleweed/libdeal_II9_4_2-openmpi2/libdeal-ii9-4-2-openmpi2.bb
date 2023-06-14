SUMMARY = "A generic C++ finite element library"
DESCRIPTION = "deal.II is a C++ program library targeted at the computational solution of \
partial differential equations using adaptive finite elements. \
 \
This package provides the shared library for deal.II."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "libdeal_II9_4_2-openmpi2-9.4.2-1.4.aarch64.rpm"
RPM_HASH = "f8ef24e58e67802f8dc9a35e331d2be4a94330b3daf75747af98a6da5909436db70a36ca63458812f2f295503d63efe3f64e32aa4125ae171f330621756aeec3"

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
