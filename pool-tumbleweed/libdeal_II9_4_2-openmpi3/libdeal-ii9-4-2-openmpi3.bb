SUMMARY = "A generic C++ finite element library"
DESCRIPTION = "deal.II is a C++ program library targeted at the computational solution of \
partial differential equations using adaptive finite elements. \
 \
This package provides the shared library for deal.II."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "libdeal_II9_4_2-openmpi3-9.4.2-1.4.aarch64.rpm"
RPM_HASH = "e5fae390e52ece43ec01dd34cbb2d72533dc87cc38e81ad1893e2e07327913b5148d8245c6bd7fc005ea30e59ed553bf49fc06443860d5bf7747bd1f9a34778c"

RPROVIDES:${PN} += "libdeal_II.so.9.4.2()(64bit) \
libdeal_II9_4_2-openmpi3 \
libdeal_II9_4_2-openmpi3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_serialization.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgmsh.so.4.11()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libhdf5.so.200()(64bit) \
libm.so.6()(64bit) \
libmetis.so.5()(64bit) \
libmpi.so.40()(64bit) \
libmuparser.so.2.3.4()(64bit) \
libopenblas.so.0()(64bit) \
libscalapack.so.2.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libtbb.so.12()(64bit) \
libumfpack.so.5()(64bit) \
libz.so.1()(64bit)"

inherit rpm
