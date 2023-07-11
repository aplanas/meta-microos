SUMMARY = "E-book reader"
DESCRIPTION = "An eBook reader for Elementary OS. \
 \
It uses poppler for decoding and read formats like EPUB, PDF, mobi, cbr, etc."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "bookworm-1.1.2-2.11.aarch64.rpm"
RPM_HASH = "c7fdaa5709a2a8baac3373b0fb71743003ec959b1a83bdc2f214e95179fb4358792a406592abf58fda66486cf7322de336b8ecbe1085d44a5686463fb4d3344b"

RPROVIDES:${PN} += "bookworm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
html2text \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpoppler-glib.so.8 \
libsoup-2.4.so.1 \
libsqlite3.so.0 \
libwebkit2gtk-4.0.so.37 \
libxml2.so.2 \
poppler-tools"

inherit rpm
