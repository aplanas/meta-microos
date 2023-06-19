SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-libc++1-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "e163c65c2ae899a5848ca94cd800bf42e90168fd6bda4b936d4c8db5c4e41245772c63e478e25ac1a8efc2b469dae510e76e8f8eb53e86161275522bf0dbf1bd"

RPROVIDES:${PN} += "libc++.so.1 \
libc++1 \
llvm14-libc++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc++abi.so.1 \
libc++abi1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
