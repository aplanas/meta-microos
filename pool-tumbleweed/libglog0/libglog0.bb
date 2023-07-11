SUMMARY = "Logging library for C++"
DESCRIPTION = "The glog library implements application-level logging. \
This library provides logging APIs based on C++-style \
streams and various helper macros."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "libglog0-0.5.0-1.9.aarch64.rpm"
RPM_HASH = "762f6bd0e7bfe404992e5e6ae13d8dc2b520764c9afa26a0954f2cebdf06fc076af1e4e5d5d4000395b830920d0faedd37f520c9056bcb48018f5de4a24e79f3"

RPROVIDES:${PN} += "libglog.so.0 \
libglog0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
