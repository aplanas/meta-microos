SUMMARY = "Extended osip2 library"
DESCRIPTION = "Extended library for the osip2 protocol."
LICENSE = "GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "libeXosip2-15-5.3.0-1.3.aarch64.rpm"
RPM_HASH = "0f6cde6541e073344c0619a2b3cd5edc56b1695c52de06cc5b6126968b8fa4e18138efbc12e7a2c632d3e72cc1bf6bcf648149760ef662e467d249e798b24b80"

RPROVIDES:${PN} += "libeXosip2 \
libeXosip2-15 \
libeXosip2-15(aarch-64) \
libeXosip2.so.15()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcares.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libosip2.so.15()(64bit) \
libosipparser2.so.15()(64bit) \
libssl.so.3()(64bit)"

inherit rpm
