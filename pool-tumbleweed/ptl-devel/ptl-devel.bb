SUMMARY = "Headers for building with PTL"
DESCRIPTION = "Parallel Tasking Library (PTL) is a C++11 multithreading tasking \
system on top of std::thread featuring thread pools, task groups, \
and lock-free task queues. \
 \
This package provides the headers and sources for developing against PTL."
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "ptl-devel-2.3.3-1.10.aarch64.rpm"
RPM_HASH = "b8eb018acc9956f13f58dd74bc185bc2ecc756143e1eab7ec58f6c5e68ec86419ed0846653adc746c67e9bc1735714fc83ecd05047d8b40c384ec70f77cec8b0"

RPROVIDES:${PN} += "cmake-PTL \
pkgconfig-ptl \
ptl-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libptl2 \
pkgconfig-tbb \
tbb-devel"

inherit rpm
