SUMMARY = "PDF to SVG Converter"
DESCRIPTION = "A small tool to convert PDF files into SVG using poppler and cairo."
LICENSE = "GPL-2.0+"

PV = "0.2.3"

RPM_NAME = "pdf2svg-0.2.3-1.31.aarch64.rpm"
RPM_HASH = "30df9ffba01225db4bb2bcb7fbf53a023df5bf0c814facc245466239ee6c033d9767cb600989e3cdc5abdae42c74d6e564320530e4224a0a771c87f592bf1d01"

RPROVIDES:${PN} += "pdf2svg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpoppler-glib.so.8"

inherit rpm
