SUMMARY = "ZRTP key exchange protocol implementation"
DESCRIPTION = "bzrtp is an implementation of the ZRTP key exchange protocol. \
The library written in C89."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "libbzrtp0-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "fc5e25c1a5660e183e34cdbd5cb307af22f87dee10a1551b2507d1a43bc3a7284a6d1036f34e68cb2ad9172a40425ca119c4884f7854730aeef8489c438b0388"

RPROVIDES:${PN} += "libbzrtp.so.0 \
libbzrtp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libc.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libxml2.so.2"

inherit rpm
