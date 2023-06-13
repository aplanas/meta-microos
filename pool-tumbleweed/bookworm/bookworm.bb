SUMMARY = "E-book reader"
DESCRIPTION = "An eBook reader for Elementary OS. \
 \
It uses poppler for decoding and read formats like EPUB, PDF, mobi, cbr, etc."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "bookworm-1.1.2-2.10.aarch64.rpm"
RPM_HASH = "a89aa74e2378e8866c1f4ae0b9fb86cbb62fc62acc995fbd750981286a22df55fd5f8532ea0bdec3e965cfd91aff0c3206e7a7f92765c6fbe048071a2281ac58"

RPROVIDES:${PN} += "application() \
application(com.github.babluboy.bookworm.desktop) \
bookworm \
bookworm(aarch-64) \
metainfo() \
metainfo(com.github.babluboy.bookworm.appdata.xml) \
mimehandler(application/cbr) \
mimehandler(application/epub+zip) \
mimehandler(application/fb2+xml) \
mimehandler(application/fb2+zip) \
mimehandler(application/pdf) \
mimehandler(application/x-cbz) \
mimehandler(application/x-pdf)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
html2text \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgranite.so.6()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpoppler-glib.so.8()(64bit) \
libsoup-2.4.so.1()(64bit) \
libsqlite3.so.0()(64bit) \
libwebkit2gtk-4.0.so.37()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
poppler-tools"

inherit rpm
