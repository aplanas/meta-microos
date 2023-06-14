SUMMARY = "A base library for writing document import filters"
DESCRIPTION = "librevenge is a base library for writing document import filters. It has \
interfaces for text documents, vector graphics, spreadsheets and \
presentations. \
This package contains classes to be used by converters that generate \
documents using librevenges APIs."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "0.0.5"

RPM_NAME = "librevenge-generators-0_0-0-0.0.5-1.3.aarch64.rpm"
RPM_HASH = "4e5003ac24b573a3f8537a4512964fb99b942ad63a93da8e1142ae76d001561000610f7dd98235321e92ae35e82882a13b43f4b35501885b1f7b91d394a3921f"

RPROVIDES:${PN} += "librevenge-generators-0-0-0 \
librevenge-generators-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
