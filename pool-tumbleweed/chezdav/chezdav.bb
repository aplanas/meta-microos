SUMMARY = "A simple WebDAV server program"
DESCRIPTION = "The chezdav package contains a simple tool to share a directory \
with WebDAV. The service is announced over mDNS for clients to discover."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "chezdav-3.0-1.3.aarch64.rpm"
RPM_HASH = "09de7c572097568b8e726f2c9284ca35e15cfd625bb48d9bbe7c5e52e64b79cf1684ed30e4bf787b4a144d8b00af49cc3276c7db82f79109774bb8cbd6c64589"

RPROVIDES:${PN} += "chezdav \
chezdav(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libavahi-gobject.so.0()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libphodav-3.0.so.0()(64bit) \
libsoup-3.0.so.0()(64bit)"

inherit rpm
