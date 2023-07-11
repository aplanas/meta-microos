SUMMARY = "C++ Rest library"
DESCRIPTION = "The C++ REST SDK is a Microsoft project for cloud-based client-server \
communication in native code using a modern asynchronous C++ API design. This \
project aims to help C++ developers connect to and interact with services."
LICENSE = "MIT & BSD-3-Clause & Zlib"

PV = "2.10.18"

RPM_NAME = "libcpprest2_10-2.10.18-1.15.aarch64.rpm"
RPM_HASH = "64c45b8ae149ab7bc220c3520402cf630e5ec815cd1b0681b11e1f55ace4c01d49cd508c9339de859cd885ffc640c6dfabc60306b224f588786ec7d8052801b0"

RPROVIDES:${PN} += "libcpprest.so.2.10 \
libcpprest2-10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
