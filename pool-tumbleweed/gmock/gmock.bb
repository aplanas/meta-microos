SUMMARY = "Development files for the Google C++ Mocking Framework"
DESCRIPTION = "Inspired by jMock, EasyMock, and Hamcrest, and designed with C++'s specifics in \
mind, Google C++ Mocking Framework (or Google Mock for short) is a library for \
writing and using C++ mock classes. \
 \
This package provides shared libraries and header files for development \
with googlemock."
LICENSE = "BSD-3-Clause"

PV = "1.12.1"

RPM_NAME = "gmock-1.12.1-1.4.aarch64.rpm"
RPM_HASH = "e29938654a4cc2d47c01ca6eff88c6361444705e91b53a6d1ba3a2062d72688f8466ab41409b03ab2465bcb5aec74e8d1f6413fcfd00c3ea6961c500939ea2cf"

RPROVIDES:${PN} += "cmake-GTest \
gmock \
googlemock-devel \
libgmock-main.so.1.12.1 \
libgmock.so.1.12.1 \
pkgconfig-gmock \
pkgconfig-gmock-main"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgtest.so.1.12.1 \
libstdc++.so.6 \
pkgconfig-gtest"

inherit rpm
