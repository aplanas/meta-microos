SUMMARY = "C++ library for manipulating raw network packets"
DESCRIPTION = "The library provides a C++ interface for creating tools which \
need to send, receive and manipulate specially crafted packets."
LICENSE = "BSD-2-Clause"

PV = "4.4"

RPM_NAME = "libtins4_4-4.4-2.2.aarch64.rpm"
RPM_HASH = "3e4731c2bc6f78337d0b8a49ee9a910f9b66603172c2a37e74ab1e57643963816a37f1872a825d3c6a315e67161296300692736d6121c03a475c9b59d088a15b"

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
