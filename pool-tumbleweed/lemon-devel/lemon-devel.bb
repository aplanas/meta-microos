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

RPM_NAME = "lemon-devel-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "e17b4c249036cbf42dbea243c21dd362eaca873534c897ac53f61d0f866fc9497a4a0d873465fcddc178c38d7f3266d11e6b35bb34921930fd0d1cfc5e456625"

RPROVIDES:${PN} += "lemon-devel \
lemon-devel(aarch-64) \
pkgconfig(lemon)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
glpk-devel \
lemon \
libemon1_3_1"

inherit rpm
