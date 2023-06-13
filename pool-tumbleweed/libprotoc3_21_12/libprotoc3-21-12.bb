SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "libprotoc3_21_12-21.12-3.2.aarch64.rpm"
RPM_HASH = "e233b73a9a8754b3b79af3e2f8e449583ee95e393753d873aef24ed8c49e0858002b1cb21aabea2bc927eb59f19513c1d7db05dc6bf04b405bc3e3c05f4b36d0"

RPROVIDES:${PN} += "libprotoc-3.21.12.so()(64bit) \
libprotoc3_21_12 \
libprotoc3_21_12(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
