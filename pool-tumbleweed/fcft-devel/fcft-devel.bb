SUMMARY = "Header files for fcft,  a font loading and rasterization library"
DESCRIPTION = "fcft is a font loading and glyph rasterization library built on-top \
of FontConfig, FreeType2 and pixman."
LICENSE = "MIT"

PV = "3.1.5"

RPM_NAME = "fcft-devel-3.1.5-1.3.aarch64.rpm"
RPM_HASH = "30aa515e4c0b0c3222c12719249135e84507d45c814d6b0ecde833d6bd7112a77b75e67b6e1636ef1d0e35d9608a8843ba88fcd6b29c475a33d2d6c193c9a4c7"

RPROVIDES:${PN} += "fcft-devel \
fcft-devel(aarch-64) \
pkgconfig(fcft)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfcft4 \
pkgconfig(fontconfig) \
pkgconfig(freetype2) \
pkgconfig(harfbuzz) \
pkgconfig(libutf8proc) \
pkgconfig(pixman-1) \
pkgconfig(tllist)"

inherit rpm
