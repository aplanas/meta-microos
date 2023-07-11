SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libc++-devel-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "3754726d793054dd8b034852ecf08dd5390cbcec7e2506da6728831ab0b2a319167523a187e4ef704f58f7559358bf227ac8b6fc50691d0b6a48527dc4495cb2"

RPROVIDES:${PN} += "libc++.so \
llvm13-libc++-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++1 \
libc++abi.so"

inherit rpm
