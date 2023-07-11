SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "libprotoc3_21_12-21.12-1.1.aarch64.rpm"
RPM_HASH = "40ed9166f6c3c11ef2a7e412bd2ecf7070ab815ab57d6c0734afe85990a82d88c460bba716053722d49e8fbe74e9c7a37319c4091ec495881333cbc1198a966e"

RPROVIDES:${PN} += "libprotoc-3.21.12.so \
libprotoc3-21-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-3.21.12.so \
libstdc++.so.6"

inherit rpm
