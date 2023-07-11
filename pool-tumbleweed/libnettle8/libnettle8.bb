SUMMARY = "Cryptographic Library"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9.1"

RPM_NAME = "libnettle8-3.9.1-2.1.aarch64.rpm"
RPM_HASH = "e29d765b23e9061859c67b8d5e90b8f14f535c53afa32f680d8c0fae4964c4e0fdf9dfd3deb0b248a4cc6df3a1872d1b9e9065fb2f1935aec474f5144c41a41c"

RPROVIDES:${PN} += "libnettle.so.8 \
libnettle8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
