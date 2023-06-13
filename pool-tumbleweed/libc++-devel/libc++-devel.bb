SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "libc++-devel-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "97261b8878849329971e997594e03a44521cd1c5f8641bab43ed4cea27e9cf79ac1783ea49a0fbf7ba3f38e13bde48ab3bfe0d9547f43ba651019e2425a7d385"

RPROVIDES:${PN} += "libc++-devel \
libc++-devel(aarch-64) \
libc++.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++1 \
libc++abi.so"

inherit rpm
