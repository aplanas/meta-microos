SUMMARY = "Client library for interacting with the Zeitgeist daemon"
DESCRIPTION = "Libzeitgeist is a client library for interacting with the Zeitgeist \
daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.18"

RPM_NAME = "libzeitgeist-1_0-1-0.3.18-12.3.aarch64.rpm"
RPM_HASH = "d750195ddd2ad1dfc2b31bd9b4e0c78bf365d440d072bf34af7f427010db12770c450553383bfc8340453a51566552e1b8e907e11e5132adde7e17348239a0fd"

RPROVIDES:${PN} += "libzeitgeist-1.0.so.1()(64bit) \
libzeitgeist-1_0-1 \
libzeitgeist-1_0-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
