SUMMARY = "C++ standard library implementation (devel package)"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11. (development files)"
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-libc++-devel-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "5cea2be34b74c8e796adec9d01298d29e94011335ffd996dabe37f7717ccbc2fb01e6119df748127f8213ded1450a614db05efc6d96191b16c45a27575eccb6b"

RPROVIDES:${PN} += "libc++.so \
llvm15-libc++-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc++1 \
libc++abi.so"

inherit rpm
