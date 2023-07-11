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

RPM_NAME = "libemon1_3_1-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "aefac5af388cdd3f591f69d9c4a7b2d539d2be129fd13a1645aef90f0da91da671e1163f3639edb537ca89633f347f030806b4c88c7cd366ffb34c61f834dcb6"

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
