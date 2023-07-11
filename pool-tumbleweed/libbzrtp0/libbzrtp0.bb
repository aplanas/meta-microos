SUMMARY = "ZRTP key exchange protocol implementation"
DESCRIPTION = "bzrtp is an implementation of the ZRTP key exchange protocol. \
The library written in C89."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "libbzrtp0-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "5fa4e9e8ee73b4a9d50cc95c5e74414f276a45da03d39cd01a6b57a3cf0c669432425d899d728c276e7238318210863df43e7146b8b65762b9d0dbd8e8f0e550"

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
