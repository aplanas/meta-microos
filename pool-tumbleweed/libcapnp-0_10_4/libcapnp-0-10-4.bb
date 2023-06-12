SUMMARY = "The Cap'n Proto data serialization library"
DESCRIPTION = "Cap'n Proto is a binary data interchange format and capability-based \
RPC system. \
 \
This package provides runtime libraries for capnproto."
LICENSE = "MIT"

PV = "0.10.4"

RPM_NAME = "libcapnp-0_10_4-0.10.4-1.1.aarch64.rpm"
RPM_HASH = "4d60346802f8d3894a297b2f8a85d497de7206e43b903c9f82feb28fe05f7f1cd1e08a3fd918f67d978800b859a458ee8bf4ca9c4f713d942e9a3afccfc11e6d"

RPROVIDES:${PN} += "libcapnp-0.10.4.so()(64bit) \
libcapnp-0_10_4 \
libcapnp-0_10_4(aarch-64) \
libcapnp-json-0.10.4.so()(64bit) \
libcapnp-rpc-0.10.4.so()(64bit) \
libcapnp-websocket-0.10.4.so()(64bit) \
libcapnpc-0.10.4.so()(64bit) \
libkj-0.10.4.so()(64bit) \
libkj-async-0.10.4.so()(64bit) \
libkj-http-0.10.4.so()(64bit) \
libkj-test-0.10.4.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
