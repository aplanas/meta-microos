SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-libc++-devel-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "385d270e15f4d0b8b63521c0b0c51c899d4365a60481049ef07b20e4b5e1fd28a67541173ac8378f52a082295d41a30446d0c274a74a6c2009ede2d3a365141b"

RPROVIDES:${PN} += "libc++.so \
llvm14-libc++-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++1 \
libc++abi.so"

inherit rpm
