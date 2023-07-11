SUMMARY = "C++ standard library ABI (devel package)"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11. \
(development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-libc++abi-devel-13.0.1-10.1.aarch64.rpm"
RPM_HASH = "eb109205be702ce5ab713eb1c3f2b1a244c1c5912476371fc138872e02dcc87c9ef0f832cd84035a4e553b511a000a5927ec31372787277b5da7afeda6e328fc"

RPROVIDES:${PN} += "libc++abi.so \
llvm13-libc++abi-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++abi1"

inherit rpm
