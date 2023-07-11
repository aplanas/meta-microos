SUMMARY = "A Data Serialization Format"
DESCRIPTION = "Cap'n Proto is a binary data interchange format and capability-based \
RPC system."
LICENSE = "MIT"

PV = "0.10.4"

RPM_NAME = "capnproto-0.10.4-1.2.aarch64.rpm"
RPM_HASH = "9d5cbade7413dc8ada53ade33f044319bb5cd84544e87c3cd1dbe18eb4458b7a1162aa8ad325795a9aba28768017f4d3800e9d79f5b180fb50df8ab03bb63cd3"

RPROVIDES:${PN} += "capnproto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcapnp-0-10-4 \
libcapnp-0.10.4.so \
libcapnp-json-0.10.4.so \
libcapnpc-0.10.4.so \
libgcc-s.so.1 \
libkj-0.10.4.so \
libstdc++.so.6"

inherit rpm
