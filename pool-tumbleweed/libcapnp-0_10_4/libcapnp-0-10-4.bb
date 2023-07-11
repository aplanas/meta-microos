SUMMARY = "The Cap'n Proto data serialization library"
DESCRIPTION = "Cap'n Proto is a binary data interchange format and capability-based \
RPC system. \
 \
This package provides runtime libraries for capnproto."
LICENSE = "MIT"

PV = "0.10.4"

RPM_NAME = "libcapnp-0_10_4-0.10.4-1.2.aarch64.rpm"
RPM_HASH = "00b5d3b4f371aa8ce159805c88367cbd222eab7d7179cba731a33e92b5033d858e5e43b9c4e7f76fc933bf65ef220d573085173b8880fdb4f640f7078d3dffd2"

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
