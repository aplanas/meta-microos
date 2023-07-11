SUMMARY = "GNOME Document Viewer System Library"
DESCRIPTION = "Evince is a document viewer capable of displaying single-page and multi-page \
document formats like PDF and PostScript."
LICENSE = "GPL-2.0-or-later"

PV = "44.3"

RPM_NAME = "libevview3-3-44.3-1.1.aarch64.rpm"
RPM_HASH = "6bfd5ccb6eead9bbb8beb3df442f03d3664342aec18668d886706cd5e0f4e62bcaa1609968927f43b00000c60a17fc9e7378b50142c6850d78a0b775d69396f8"

RPROVIDES:${PN} += "libevview3-3 \
libevview3.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libevdocument3.so.4 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.2 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
