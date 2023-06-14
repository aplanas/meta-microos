SUMMARY = "C++ standard library ABI"
DESCRIPTION = "This package contains the ABI for libc++, a new implementation \
of the C++ standard library, targeting C++11."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-libc++abi1-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "5267f8dd2c1588b1c7d477598df46c0fc820f3e58cfe2ec2f59e48919d49f3d87094a66b59dfeec54a1e3a2286fc421116ba22d8f5a07d3fea9ac539999a45ef"

RPROVIDES:${PN} += "libc++abi.so.1 \
libc++abi1 \
llvm14-libc++abi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
