SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-libc++1-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "99d77044077cda08f10b28ce85ab52f38c696727f0d9c6d9428f8be50eedf902a8a9b2c9d1da52bc11b95f56a28343679bf244041e5201005bffeaf61eece7c7"

RPROVIDES:${PN} += "libc++.so.1 \
libc++1 \
llvm15-libc++1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc++abi.so.1 \
libc++abi1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
