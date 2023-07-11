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

RPM_NAME = "gtest-1.12.1-1.4.aarch64.rpm"
RPM_HASH = "63119d0866616183e8bf89d742e723e67e3a49023283de8963e28d2d3b62953c85947a2608823d4ead9e374c0f5b0f2107f73eeb5b44f7bd59bdddecf3159355"

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
