SUMMARY = "Extended osip2 library"
DESCRIPTION = "Extended library for the osip2 protocol."
LICENSE = "GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "libeXosip2-15-5.3.0-1.3.aarch64.rpm"
RPM_HASH = "0f6cde6541e073344c0619a2b3cd5edc56b1695c52de06cc5b6126968b8fa4e18138efbc12e7a2c632d3e72cc1bf6bcf648149760ef662e467d249e798b24b80"

RPROVIDES:${PN} += "libeXosip2 \
libeXosip2-15 \
libeXosip2.so.15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3 \
libosip2.so.15 \
libosipparser2.so.15 \
libssl.so.3"

inherit rpm
