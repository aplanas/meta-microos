SUMMARY = "Cryptographic Library"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9"

RPM_NAME = "libnettle8-3.9-1.1.aarch64.rpm"
RPM_HASH = "0c4aee38caebaaedb77f9753dcc92338c8958b927286be360f9866659bf010b7b2b734cca2d73dc07a215a9e7305f7ed1dac8fa236a2f84cb227f833ada7cabc"

RPROVIDES:${PN} += "libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit) \
libnettle.so.8(NETTLE_INTERNAL_8_7)(64bit) \
libnettle8 \
libnettle8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
