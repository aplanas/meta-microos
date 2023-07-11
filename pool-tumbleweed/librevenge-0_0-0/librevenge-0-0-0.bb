SUMMARY = "A base library for writing document import filters"
DESCRIPTION = "librevenge is a base library for writing document import filters. It has \
interfaces for text documents, vector graphics, spreadsheets and \
presentations."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "0.0.5"

RPM_NAME = "librevenge-0_0-0-0.0.5-1.4.aarch64.rpm"
RPM_HASH = "ab344c5aa8cf9d18d67e8f73a9a740661b0db4bbbc355822ab8ad2b854fe323cfb0dabd2ae81229f68ee8b0b7a11a72925badb1166a32fe7b03032978ef5669c"

RPROVIDES:${PN} += "librevenge-0-0-0 \
librevenge-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
