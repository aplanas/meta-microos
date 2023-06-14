SUMMARY = "Interactive Connectivity Establishment implementation"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE)."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.21"

RPM_NAME = "libnice-0.1.21-2.1.aarch64.rpm"
RPM_HASH = "a4aacaebf71223018547ed7ef8782b1971c24eb32950c7923a8bf67e2dfbb8400be71656fe86e335ffd998c47f5c65711af7689395fe146810800dee1a3f597b"

RPROVIDES:${PN} += "libnice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30"

inherit rpm
