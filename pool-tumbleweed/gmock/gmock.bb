SUMMARY = "Development files for the Google C++ Mocking Framework"
DESCRIPTION = "Inspired by jMock, EasyMock, and Hamcrest, and designed with C++'s specifics in \
mind, Google C++ Mocking Framework (or Google Mock for short) is a library for \
writing and using C++ mock classes. \
 \
This package provides shared libraries and header files for development \
with googlemock."
LICENSE = "BSD-3-Clause"

PV = "1.12.1"

RPM_NAME = "gmock-1.12.1-1.3.aarch64.rpm"
RPM_HASH = "5bab5693e4f84fb55accd05326b5d3ff3d9d9f43ceacea0c6a5a33ede6cc83cea84c6da0a4d8247a13fecff37f5f74e19c99ab154328ac6bd1d9fcfdbf49803e"

RPROVIDES:${PN} += "cmake(GTest) \
gmock \
gmock(aarch-64) \
googlemock-devel \
libgmock.so.1.12.1()(64bit) \
libgmock_main.so.1.12.1()(64bit) \
pkgconfig(gmock) \
pkgconfig(gmock_main)"
RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgtest.so.1.12.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
pkgconfig(gtest)"

inherit rpm
