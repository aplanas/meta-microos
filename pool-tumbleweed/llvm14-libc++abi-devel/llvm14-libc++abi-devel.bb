SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-libc++abi-devel-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "8a97f9a2bd502e6f6b3a5d59e239e1ff608e0fafce0a8d78051e42efad67c9c4cd69346d5402d14e2b6c64dbb6ac68259baaff9ae9d73e6dfb83e04e20e0c8b4"

RPROVIDES:${PN} += "libc++abi.so \
llvm14-libc++abi-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++abi1"

inherit rpm
