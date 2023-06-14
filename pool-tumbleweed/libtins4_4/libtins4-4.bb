SUMMARY = "C++ library for manipulating raw network packets"
DESCRIPTION = "The library provides a C++ interface for creating tools which \
need to send, receive and manipulate specially crafted packets."
LICENSE = "BSD-2-Clause"

PV = "4.4"

RPM_NAME = "libtins4_4-4.4-2.1.aarch64.rpm"
RPM_HASH = "0568071f79692bc39c813b75d6d7f1c40c63896460e344b5d5c39a1b5476582631b1ac92d75f2517d934eb9882667d62c050a1f557b1c2abca295bc41f27dca9"

RPROVIDES:${PN} += "libtins.so.4.4 \
libtins4-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpcap.so.1 \
libstdc++.so.6"

inherit rpm
