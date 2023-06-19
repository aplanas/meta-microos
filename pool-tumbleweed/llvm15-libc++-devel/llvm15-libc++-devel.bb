SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-libc++-devel-15.0.7-2.4.aarch64.rpm"
RPM_HASH = "cc8b917378019624ec466abfbaa4e3a95f72b30da3ccf921560ce8c246bbf07b6d5627b8831d239badc97ee59048fee29b81a4892ac84f1afeaefd9798672c7a"

RPROVIDES:${PN} += "libc++.so \
llvm15-libc++-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++1 \
libc++abi.so"

inherit rpm
