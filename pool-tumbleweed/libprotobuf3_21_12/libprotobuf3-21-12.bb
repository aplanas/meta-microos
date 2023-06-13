SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "libprotobuf3_21_12-21.12-3.2.aarch64.rpm"
RPM_HASH = "86b65bb4fc52ba4a4e71dbe40dfede4c0497d8e7b3ad51b79ff704f461a321fc55b1acb5cf736cacedc87597ae1937feb6d3bb5053621e8143a549efcc9130d2"

RPROVIDES:${PN} += "libprotobuf-3.21.12.so()(64bit) \
libprotobuf3_21_12 \
libprotobuf3_21_12(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
