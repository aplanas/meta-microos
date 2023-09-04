SUMMARY = "A generic C++ finite element library"
DESCRIPTION = "deal.II is a C++ program library targeted at the computational solution of \
partial differential equations using adaptive finite elements. \
 \
This package provides the shared library for deal.II."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.1"

RPM_NAME = "libdeal_II9_5_1-9.5.1-1.1.aarch64.rpm"
RPM_HASH = "5d4b7c0fb170eadfbfa561e00efd07665d446324bf060351c957c4bf57ccd7466406c8111ddc5b7f60cd3e6c3d25cf9e0eb09af97143c5afec19f44655a6da07"

RPROVIDES:${PN} += "libdeal-II.so.9.5.1 \
libdeal-II9-5-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-iostreams.so.1.82.0 \
libboost-serialization.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgmsh.so.4.11 \
libgomp.so.1 \
libgsl.so.27 \
libkokkoscore.so.4.1 \
libm.so.6 \
libmetis.so.5 \
libmuparser.so.2.3.4 \
libopenblas.so.0 \
libstdc++.so.6 \
libtbb.so.12 \
libumfpack.so.5 \
libz.so.1"

inherit rpm
