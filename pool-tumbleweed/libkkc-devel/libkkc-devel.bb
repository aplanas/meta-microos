SUMMARY = "Development files for libkkc"
DESCRIPTION = "libkkc provides a converter from Japanese Kana-string to Kana-Kanji-mixed-string. \
 \
This package contains its development headers and vala bindings."
LICENSE = "GPL-3.0-only"

PV = "0.3.6~git20200818.e33e7fb"

RPM_NAME = "libkkc-devel-0.3.6~git20200818.e33e7fb-1.18.aarch64.rpm"
RPM_HASH = "97d7b92bd39777a9ba6ead417f2d9d8ac1f32d8e439a1431733300da6792ec3748c87d52ad0b2d3f3a58620b63c5de49368116bf9b2e2e8fbfe0fa4def657a67"

RPROVIDES:${PN} += "libkkc-devel \
pkgconfig-kkc-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libkkc2 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-json-glib-1.0"

inherit rpm
