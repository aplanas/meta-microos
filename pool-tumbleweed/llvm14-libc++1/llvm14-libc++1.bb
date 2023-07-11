SUMMARY = "C++ standard library implementation"
DESCRIPTION = "This package contains libc++, a new implementation of the C++ \
standard library, targeting C++11."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-libc++1-14.0.6-10.1.aarch64.rpm"
RPM_HASH = "a5e1e488f0833e5bbd821550b8bbd95867b812101cc28a92b5a447ed1338c44fa813b623145aa6efe6527748c28c9c7728ee387e3dd25ff628374d64dff7456f"

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
