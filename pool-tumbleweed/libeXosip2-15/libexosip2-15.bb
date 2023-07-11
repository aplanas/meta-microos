SUMMARY = "Extended osip2 library"
DESCRIPTION = "Extended library for the osip2 protocol."
LICENSE = "GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "libeXosip2-15-5.3.0-1.4.aarch64.rpm"
RPM_HASH = "5c745115dc5abd369f4fabbb81ded93a408b6f0409631e14e1c2703e4e55d6abae5162bb039bd6344baccd1b313ea9e7ce9831f511ef1413005e5f794ed07a44"

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
