SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "libprotobuf3_21_12-21.12-1.1.aarch64.rpm"
RPM_HASH = "e31b02455cb0dd7faf2bb05a38e7f45046bc8b6964481868aba9496d7ca671ae680e6e5519d6239fe273d5053bcb69508a26358fe197c81f984a15dcc87010a0"

RPROVIDES:${PN} += "libprotobuf-3.21.12.so \
libprotobuf3-21-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
