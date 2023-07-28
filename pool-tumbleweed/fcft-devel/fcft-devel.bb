SUMMARY = "Header files for fcft,  a font loading and rasterization library"
DESCRIPTION = "fcft is a font loading and glyph rasterization library built on-top \
of FontConfig, FreeType2 and pixman."
LICENSE = "MIT"

PV = "3.1.6"

RPM_NAME = "fcft-devel-3.1.6-1.1.aarch64.rpm"
RPM_HASH = "e557789e105506b67f234761f3c87cda6fff7f6c113ea0535fc0d23e58443fc70b5c3d3369fb5c76010d1cede45da7f80e42c366f6c874ac8bc494ddcb6ce23b"

RPROVIDES:${PN} += "fcft-devel \
pkgconfig-fcft"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfcft4 \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-harfbuzz \
pkgconfig-libutf8proc \
pkgconfig-pixman-1 \
pkgconfig-tllist"

inherit rpm
