SUMMARY = "Development files for the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the development files."
LICENSE = "MIT"

PV = "8.1.1"

RPM_NAME = "harfbuzz-devel-8.1.1-1.1.aarch64.rpm"
RPM_HASH = "c3696e17d544ceeb57a247822cc97067880bed8188430004cf5d19c429b847d931b6521ab98030306e550dd9e474bc69c49f62cdf73b5ff8526e0b1376ce73c7"

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
