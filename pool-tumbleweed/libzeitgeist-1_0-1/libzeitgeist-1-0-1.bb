SUMMARY = "Client library for interacting with the Zeitgeist daemon"
DESCRIPTION = "Libzeitgeist is a client library for interacting with the Zeitgeist \
daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.18"

RPM_NAME = "libzeitgeist-1_0-1-0.3.18-12.4.aarch64.rpm"
RPM_HASH = "734fa2c139bad20d4604c7f189e4337d0041c37c55e37e3d35e34e876035c9ffbf48d0507ed280e3ef068b06b73fdfbfde009edbc74f09befdb16d9eaba1b365"

RPROVIDES:${PN} += "libzeitgeist-1-0-1 \
libzeitgeist-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
