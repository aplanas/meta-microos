SUMMARY = "Jabber Client Library Written in C"
DESCRIPTION = "Loudmouth is a lightweight and easy-to-use C library for programming \
with the Jabber protocol. It is designed to be easy to get started with \
and yet extensible to let you do anything the Jabber protocol allows."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.4"

RPM_NAME = "libloudmouth-1-0-1.5.4-1.7.aarch64.rpm"
RPM_HASH = "5a0e5a8b0b74a7b6e8d5fc87a68e0f70e3c1a636b553a92c3cf75139dc0a10ac8a3907e9622f22f0083d88832f7ecdf7121b41e1882c6a6bd62231b76cfe0abb"

RPROVIDES:${PN} += "libloudmouth-1-0 \
libloudmouth-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgssapi-krb5.so.2 \
libidn.so.12 \
libssl.so.3"

inherit rpm
