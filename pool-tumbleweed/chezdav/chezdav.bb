SUMMARY = "A simple WebDAV server program"
DESCRIPTION = "The chezdav package contains a simple tool to share a directory \
with WebDAV. The service is announced over mDNS for clients to discover."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "chezdav-3.0-1.4.aarch64.rpm"
RPM_HASH = "f3f338f61794df9963d994e74ea8c896f1fc707c0d7a138682890773a5f9d3c429a94fb323cf6b345c35f3025a747de4bccf7dfa9ba4fd49bb0a436e86edcd37"

RPROVIDES:${PN} += "chezdav"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-gobject.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libphodav-3.0.so.0 \
libsoup-3.0.so.0"

inherit rpm
