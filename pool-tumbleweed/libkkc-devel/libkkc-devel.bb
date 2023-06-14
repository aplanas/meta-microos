SUMMARY = "Development files for libkkc"
DESCRIPTION = "libkkc provides a converter from Japanese Kana-string to Kana-Kanji-mixed-string. \
 \
This package contains its development headers and vala bindings."
LICENSE = "GPL-3.0-only"

PV = "0.3.6~git20200818.e33e7fb"

RPM_NAME = "libkkc-devel-0.3.6~git20200818.e33e7fb-1.17.aarch64.rpm"
RPM_HASH = "06342099535df273e532aecf70a5afc8e6bb3b13bb7c7a7f2d9f6e1e4a0a9168e901797c330431e5b531823a42c4745168eac96e2263324b8626fe3259edcae9"

RPROVIDES:${PN} += "libkkc-devel \
pkgconfig-kkc-1.0"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libkkc2 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-json-glib-1.0"

inherit rpm
