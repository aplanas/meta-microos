SUMMARY = "Qt 6 CoAP Client Library"
DESCRIPTION = "Qt 6 library to implement a CoAP client."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Coap6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "f5353559eb7d7efdafb97c541464862d2bbde62b63da4639cbd064bf366877b79f319ac237d30ed226d09238fff4ed95116d14f9f215b2cc4d9bcdfa786f9b13"

RPROVIDES:${PN} += "libQt6Coap.so.6 \
libQt6Coap6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
