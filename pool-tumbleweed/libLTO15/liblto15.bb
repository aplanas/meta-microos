SUMMARY = "Link-time optimizer for LLVM"
DESCRIPTION = "This package contains the link-time optimizer for LLVM."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "libLTO15-15.0.7-3.1.aarch64.rpm"
RPM_HASH = "9ba0d556947294401c787f2126b10a621cbb28624a61b92fe7a5f70dc1ec6d50f29fb0934a29a1100e956f51462c8b12d79644e0a255196370b11d1e12b6c2a2"

RPROVIDES:${PN} += "libLTO.so.15 \
libLTO15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
