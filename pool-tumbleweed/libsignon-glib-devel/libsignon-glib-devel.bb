SUMMARY = "Development headers for libsignon-glib"
DESCRIPTION = "GLib-based client library for applications handling account \
authentication through the Online Accounts Single Sign-On service \
 \
This package provides development headers for libsignon-glib."
LICENSE = "LGPL-2.1-only"

PV = "2.1"

RPM_NAME = "libsignon-glib-devel-2.1-1.18.aarch64.rpm"
RPM_HASH = "7f38f10c32262aaa4d8fca08558c4dd3c64f9c9ae032c19e5f6f5b82cbce1be68d477d40248a091d555e0b2ae44c5d3065c978e596a1bf92bdabef07af0d15be"

RPROVIDES:${PN} += "libsignon-glib-devel \
pkgconfig-libsignon-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsignon-glib2 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
