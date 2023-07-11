SUMMARY = "A base library for writing document import filters"
DESCRIPTION = "librevenge is a base library for writing document import filters. It has \
interfaces for text documents, vector graphics, spreadsheets and \
presentations. \
This package contains classes to be used by converters that generate \
documents using librevenges APIs."
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "0.0.5"

RPM_NAME = "librevenge-generators-0_0-0-0.0.5-1.4.aarch64.rpm"
RPM_HASH = "19f6882219cf9fcc3e54e06864134bbf26d6e833e9080b1a348f6888da3d966105672ee318b6c9894a5081eaaf5b52b3e00625bac03f5c546f10339982e123d2"

RPROVIDES:${PN} += "librevenge-generators-0-0-0 \
librevenge-generators-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
