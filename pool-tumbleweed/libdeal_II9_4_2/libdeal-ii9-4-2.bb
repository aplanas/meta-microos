SUMMARY = "A generic C++ finite element library"
DESCRIPTION = "deal.II is a C++ program library targeted at the computational solution of \
partial differential equations using adaptive finite elements. \
 \
This package provides the shared library for deal.II."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "libdeal_II9_4_2-9.4.2-1.4.aarch64.rpm"
RPM_HASH = "ee2d313facf42c33d7bd984f15b719fc2356e919d702ef359ee4681a32279de12ca360fd799b4d485fd027dcb0501e88773608d54c7e3285b32ff1be894d19ab"

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
