SUMMARY = "The Cap'n Proto data serialization library"
DESCRIPTION = "Cap'n Proto is a binary data interchange format and capability-based \
RPC system. \
 \
This package provides runtime libraries for capnproto."
LICENSE = "MIT"

PV = "0.10.4"

RPM_NAME = "libcapnp-0_10_4-0.10.4-1.1.aarch64.rpm"
RPM_HASH = "4d60346802f8d3894a297b2f8a85d497de7206e43b903c9f82feb28fe05f7f1cd1e08a3fd918f67d978800b859a458ee8bf4ca9c4f713d942e9a3afccfc11e6d"

RPROVIDES:${PN} += "libcapnp-0-10-4 \
libcapnp-0.10.4.so \
libcapnp-json-0.10.4.so \
libcapnp-rpc-0.10.4.so \
libcapnp-websocket-0.10.4.so \
libcapnpc-0.10.4.so \
libkj-0.10.4.so \
libkj-async-0.10.4.so \
libkj-http-0.10.4.so \
libkj-test-0.10.4.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
