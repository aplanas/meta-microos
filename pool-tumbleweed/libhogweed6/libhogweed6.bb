SUMMARY = "Cryptographic Library for Public Key Algorithms"
DESCRIPTION = "Nettle is a cryptographic library that is designed to fit easily in more or \
less any context: In crypto toolkits for object-oriented languages (C++, \
Python, Pike, ...), in applications like LSH or GNUPG, or even in kernel space. \
 \
The libhogweed library contains public key algorithms to use with libnettle."
LICENSE = "LGPL-2.1-or-later"

PV = "3.9"

RPM_NAME = "libhogweed6-3.9-1.1.aarch64.rpm"
RPM_HASH = "f870b1e26769e3c8d96cb1172bfb3f5d2240690f94d4d2d3a4b0815606d95735c8320e6313b783dfe269325018d3ce050c8cadecb3801d5dd1b16da502b64978"

RPROVIDES:${PN} += "libhogweed.so.6()(64bit) \
libhogweed.so.6(HOGWEED_6)(64bit) \
libhogweed.so.6(HOGWEED_INTERNAL_6_7)(64bit) \
libhogweed6 \
libhogweed6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgmp.so.10()(64bit) \
libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit)"

inherit rpm
