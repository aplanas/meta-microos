SUMMARY = "Headers for building with PTL"
DESCRIPTION = "Parallel Tasking Library (PTL) is a C++11 multithreading tasking \
system on top of std::thread featuring thread pools, task groups, \
and lock-free task queues. \
 \
This package provides the headers and sources for developing against PTL."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "ptl-devel-2.3.3-1.11.aarch64.rpm"
RPM_HASH = "c0459042fc773c3dbc45ae6ce1194991e77d575e525e2062db61fa4d77206c2e6d496f8f3296ff2c5a879f272e0f0d9cbcec3071d7eb83795dc285987c93db3c"

RPROVIDES:${PN} += "cmake-PTL \
pkgconfig-ptl \
ptl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libptl2 \
pkgconfig-tbb \
tbb-devel"

inherit rpm
