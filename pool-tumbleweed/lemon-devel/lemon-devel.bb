SUMMARY = "Development headers and files for LEMON"
DESCRIPTION = "LEMON stands for Library for Efficient Modeling and Optimization in \
Networks.  It is a C++ template library providing efficient \
implementations of common data structures and algorithms with focus on \
combinatorial optimization tasks connected mainly with graphs and \
networks. \
 \
This package contains the libraries and headers for developing \
applications which use LEMON."
LICENSE = "BSL-1.0"

PV = "1.3.1"

RPM_NAME = "lemon-devel-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "7c8a2283a52ce067355d40725e8c243405c3212722d38347ef4a777a908faad20a6fc8b2af88e819de1914a02523317a40b8a66c4e9bd2f53657df4d16b4a675"

RPROVIDES:${PN} += "lemon-devel \
pkgconfig-lemon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glpk-devel \
lemon \
libemon1-3-1"

inherit rpm
