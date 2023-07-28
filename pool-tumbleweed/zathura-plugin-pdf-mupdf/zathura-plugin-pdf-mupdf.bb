SUMMARY = "Zathura PDF support through MuPDF"
DESCRIPTION = "Zathura-plugin-MupDF extends the document viewing support of Zathura to PDF, EPUB and OpenXPS with the help of MuPDF rendering engine."
LICENSE = "Zlib"

PV = "0.4.0"

RPM_NAME = "zathura-plugin-pdf-mupdf-0.4.0-4.1.aarch64.rpm"
RPM_HASH = "2b8f40042dd3cf9e5b0f6bd3ed61173c0ca3beb8a171aee4f5eedbccf537c1a2782214620672b9c4c8e5c0070e101b049d4c607499dc977084ff10a9eed47aff"

RPROVIDES:${PN} += "libpdf-mupdf.so \
zathura-pdf-mupdf-plugin \
zathura-plugin-pdf-mupdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgirara-gtk3.so.3 \
libglib-2.0.so.0 \
libharfbuzz.so.0 \
libjbig2dec.so.0 \
libjpeg.so.8 \
libopenjp2.so.7 \
libz.so.1 \
mupdf \
zathura"

inherit rpm
