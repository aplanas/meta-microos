SUMMARY = "A generic C++ finite element library"
DESCRIPTION = "deal.II is a C++ program library targeted at the computational solution of \
partial differential equations using adaptive finite elements. \
 \
This package provides the shared library for deal.II."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "libdeal_II9_4_2-9.4.2-1.5.aarch64.rpm"
RPM_HASH = "a705d7cf5056b5660bf30f62881c85b3d63e24b011f8b428e88eede907d91f52f6a269de8d0254e04b6a9bd73a45ae8c4750c93882f91d2b6669d1df092ecc68"

RPROVIDES:${PN} += "libdeal-II.so.9.4.2 \
libdeal-II9-4-2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-iostreams.so.1.82.0 \
libboost-serialization.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgmsh.so.4.11 \
libgsl.so.27 \
libm.so.6 \
libmetis.so.5 \
libmuparser.so.2.3.4 \
libopenblas.so.0 \
libstdc++.so.6 \
libtbb.so.12 \
libumfpack.so.5 \
libz.so.1"

inherit rpm
