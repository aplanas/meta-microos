SUMMARY = "Header files for fcft,  a font loading and rasterization library"
DESCRIPTION = "fcft is a font loading and glyph rasterization library built on-top \
of FontConfig, FreeType2 and pixman."
LICENSE = "MIT"

PV = "3.1.5"

RPM_NAME = "fcft-devel-3.1.5-1.4.aarch64.rpm"
RPM_HASH = "ac9d647411d50e8a0c4cd99169c3da9c8bef08917100cd45cb5f870b10d3705c92aabc338fdf30c068c1ac3ebe25d8142579580baa584213cb2fdd42186a79b3"

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
