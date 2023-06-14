SUMMARY = "A Data Serialization Format"
DESCRIPTION = "Cap'n Proto is a binary data interchange format and capability-based \
RPC system."
LICENSE = "MIT"

PV = "0.10.4"

RPM_NAME = "capnproto-0.10.4-1.1.aarch64.rpm"
RPM_HASH = "d1c759f3772b5f7bc82422c1c2d7be38dd9fbde8a59003ef2cafffa9073e68f117e567ff2eeb85a0646033dce45b32292cff580d9066ca5cf77666ab8bc961df"

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
