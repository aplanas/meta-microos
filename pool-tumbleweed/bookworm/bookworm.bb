SUMMARY = "E-book reader"
DESCRIPTION = "An eBook reader for Elementary OS. \
 \
It uses poppler for decoding and read formats like EPUB, PDF, mobi, cbr, etc."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "bookworm-1.1.2-2.10.aarch64.rpm"
RPM_HASH = "a89aa74e2378e8866c1f4ae0b9fb86cbb62fc62acc995fbd750981286a22df55fd5f8532ea0bdec3e965cfd91aff0c3206e7a7f92765c6fbe048071a2281ac58"

RPROVIDES:${PN} += "bookworm"

RDEPENDS:${PN} += "/bin/bash \
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
