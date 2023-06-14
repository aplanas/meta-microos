SUMMARY = "Library of Efficient Models and Optimization in Networks"
DESCRIPTION = "LEMON stands for Library for Efficient Modeling and Optimization in \
Networks.  It is a C++ template library providing efficient \
implementations of common data structures and algorithms with focus on \
combinatorial optimization tasks connected mainly with graphs and \
networks. \
 \
This package contains the shared library of LEMON."
LICENSE = "BSL-1.0"

PV = "1.3.1"

RPM_NAME = "libemon1_3_1-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "85289abbdecf65676573041c81fa3e797364bcbc840865ba122537bd2b3ad76a37c5d5e43346f28c7e13d4040e40af796b36a9d10bf355d19a5974a2c30a5933"

RPROVIDES:${PN} += "libemon.so.1.3.1 \
libemon1-3-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglpk.so.40 \
libglpk40 \
libstdc++.so.6"

inherit rpm
