SUMMARY = "C++ bindings for libpmemobj"
DESCRIPTION = "This package contains the header files for pmemobj's C++ interface."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "libpmemobj-cpp-devel-1.13.0-1.6.aarch64.rpm"
RPM_HASH = "6ff37c2f7f1de5d89cffa0e44c12b06d9834106ce1915ba3238fa9c387fd0cd834a9e102aefd071e2fed9c8da107e0b683eac0861a24093c6e75b357b10a5bcc"

RPROVIDES:${PN} += "libpmemobj++-devel \
libpmemobj-cpp-devel \
pkgconfig-libpmemobj++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-libpmemobj"

inherit rpm
