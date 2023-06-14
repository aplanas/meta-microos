SUMMARY = "Development files for the Google C++ Testing Framework"
DESCRIPTION = "Google's framework for writing C++ tests on a variety of platforms \
(Linux, Mac OS X, Windows, Cygwin, Windows CE, and Symbian). \
Based on the xUnit architecture. Supports automatic test discovery, \
a rich set of assertions, user-defined assertions, death tests, \
fatal and non-fatal failures, value- and type-parameterized tests, \
various options for running the tests, and XML test report generation. \
 \
This package provides shared libraries and header files for development \
with googletest."
LICENSE = "BSD-3-Clause"

PV = "1.12.1"

RPM_NAME = "gtest-1.12.1-1.3.aarch64.rpm"
RPM_HASH = "0e02f34cf3eaee06c98b1af83fd6da1bb8c49d37911475e939ce9ad3c6cbfba0d28c54499248498b489a2e8f8f545efaf673f563ac168850aee3d808b75d9844"

RPROVIDES:${PN} += "googletest-devel \
gtest \
libgtest-main.so.1.12.1 \
libgtest.so.1.12.1 \
pkgconfig-gtest \
pkgconfig-gtest-main"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
