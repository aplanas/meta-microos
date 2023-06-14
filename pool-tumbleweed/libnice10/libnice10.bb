SUMMARY = "Interactive Connectivity Establishment implementation"
DESCRIPTION = "libnice is an implementation of the IETF's draft Interactive \
Connectivity Establishment standard (ICE)."
LICENSE = "LGPL-2.1-only | MPL-1.1"

PV = "0.1.21"

RPM_NAME = "libnice10-0.1.21-2.1.aarch64.rpm"
RPM_HASH = "e137daa8532327cab368fb78eb636b545288f962cb17b2445bb835dc71e7d8a2ba8706141bd9f88db479d8b6673e5abf77e4ddc217e483c63804dbc6bd978eba"

RPROVIDES:${PN} += "libnice.so.10 \
libnice10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgupnp-igd-1.6.so.0"

inherit rpm
