SUMMARY = "Development files for the HarfBuzz OpenType text shaping engine"
DESCRIPTION = "HarfBuzz is an OpenType text shaping engine. \
This package contains the development files."
LICENSE = "MIT"

PV = "7.3.0"

RPM_NAME = "harfbuzz-devel-7.3.0-1.2.aarch64.rpm"
RPM_HASH = "feae5e3a8af28ec65bcad4c5e1b2a5e342006a1182e1ea9304ad8c334530ae79a5676eacc8b8d95433a8fbeadbda2537c965ac2a40997a91adf21460852c2a86"

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
