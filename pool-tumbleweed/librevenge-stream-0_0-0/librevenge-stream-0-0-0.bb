SUMMARY = "A base library for writing document import filters (stream implementations)"
DESCRIPTION = "librevenge is a base library for writing document import filters. It has \
interfaces for text documents, vector graphics, spreadsheets and \
presentations. \
This package contains the different stream implementations."
LICENSE = "BSD-3-Clause & (LGPL-2.1-or-later | MPL-2.0)"

PV = "0.0.5"

RPM_NAME = "librevenge-stream-0_0-0-0.0.5-1.4.aarch64.rpm"
RPM_HASH = "a443373de000f8334fb580c9f4b01fd94890c052cf8c892d85a980a364d3d1328118c83d347d0b1730c490487a014a0a1e817d8f47993384b4824c18d82552ae"

RPROVIDES:${PN} += "librevenge-stream-0-0-0 \
librevenge-stream-0.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
