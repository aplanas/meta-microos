SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "libprotobuf-lite3_21_12-21.12-1.1.aarch64.rpm"
RPM_HASH = "1bcd0f25fab72c3024a6c0d53bf168564c7287311391b724902b09c98366fb341ea27cc0b54e3db9a3e9edee43014e0ece5de0ba81523c707888fe7377694412"

RPROVIDES:${PN} += "libprotobuf-lite-3.21.12.so \
libprotobuf-lite3-21-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
