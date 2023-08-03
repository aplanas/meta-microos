SUMMARY = "Qt 6 CoAP Client Library"
DESCRIPTION = "Qt 6 library to implement a CoAP client."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Coap6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "d29be6fe9c4326c5517438bd078fa2ef295f7417a0dfc7820afaf9cb3c819dc430c795c23bc6161651c5d6cda4496849d82083df194bd5a09ed3dfc25452bbf7"

RPROVIDES:${PN} += "libQt6Coap.so.6 \
libQt6Coap6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
