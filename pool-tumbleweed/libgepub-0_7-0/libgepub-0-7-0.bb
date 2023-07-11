SUMMARY = "EPUB document reader library"
DESCRIPTION = "A GObject-based library for handling and rendering EPUB documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.1"

RPM_NAME = "libgepub-0_7-0-0.7.1-1.1.aarch64.rpm"
RPM_HASH = "2332b6266bfae2d34e6858240d3fee79b5953a4a2e368a9c5a913a894455e6755d816e00677076dc2ba4b23b4172cecdc3636a2f262a88633ed5c94e76274e48"

RPROVIDES:${PN} += "libgepub-0-7-0 \
libgepub-0.7.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjavascriptcoregtk-4.1.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.2"

inherit rpm
