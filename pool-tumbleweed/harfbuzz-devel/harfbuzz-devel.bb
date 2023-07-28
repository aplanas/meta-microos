SUMMARY = "Development files for the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the development files."
LICENSE = "MIT"

PV = "8.0.1"

RPM_NAME = "harfbuzz-devel-8.0.1-1.1.aarch64.rpm"
RPM_HASH = "1a333d350410fd821b55914b7caa37c66aaf9d3f494a326358fa4e1eaabb19bebff799078abfe3fc516bb0c9d8927fb91c059b783cefba6b8e5de013282e18d8"

RPROVIDES:${PN} += "harfbuzz-devel \
pkgconfig-harfbuzz \
pkgconfig-harfbuzz-cairo \
pkgconfig-harfbuzz-gobject \
pkgconfig-harfbuzz-icu \
pkgconfig-harfbuzz-subset"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libharfbuzz-gobject0 \
libharfbuzz-icu0 \
libharfbuzz-subset0 \
libharfbuzz0 \
pkgconfig-cairo \
pkgconfig-freetype2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-graphite2 \
pkgconfig-icu-uc \
typelib-1-0-HarfBuzz-0-0"

inherit rpm
