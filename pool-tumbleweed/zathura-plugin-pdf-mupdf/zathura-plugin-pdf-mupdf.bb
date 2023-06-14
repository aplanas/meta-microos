SUMMARY = "Zathura PDF support through MuPDF"
DESCRIPTION = "Zathura-plugin-MupDF extends the document viewing support of Zathura to PDF, EPUB and OpenXPS with the help of MuPDF rendering engine."
LICENSE = "Zlib"

PV = "0.4.0"

RPM_NAME = "zathura-plugin-pdf-mupdf-0.4.0-3.3.aarch64.rpm"
RPM_HASH = "df9022bea471de685d5a38270585a9d0049ce770eb715a6ac8072762974dd82984d987a0a7f7f0edb12f3299ac405eb94cc4082ba9290c4615dfbc27309136ce"

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
