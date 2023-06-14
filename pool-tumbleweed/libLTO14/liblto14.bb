SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "libLTO14-14.0.6-9.1.aarch64.rpm"
RPM_HASH = "969aae5e918d497f74214dc5bc9d6937d48ef9cd2e0e2850681a90f8c30ab36a41e4d46c71c32be997e0d2a250daef965b68e255e9d573294bb23b826e901976"

RPROVIDES:${PN} += "libLTO.so.14 \
libLTO14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.14 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
