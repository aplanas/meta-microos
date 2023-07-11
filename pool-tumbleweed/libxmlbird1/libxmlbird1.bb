SUMMARY = "The XML-Parse library"
DESCRIPTION = "XML parser with support for Vala iterators."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.12"

RPM_NAME = "libxmlbird1-1.2.12-1.4.aarch64.rpm"
RPM_HASH = "e1e1cd5ddba7bde14ac2341a34b034dbdd94c703324960e876f5c06454d379671edc071e81c889a8791453e8c3345912f3a8eee81e086251a90465eebde466f8"

RPROVIDES:${PN} += "libxmlbird.so.1 \
libxmlbird1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
