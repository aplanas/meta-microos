SUMMARY = "Development files for the GJS library"
DESCRIPTION = "This module contains JavaScript bindings based on gobject-introspection and the \
Mozilla SpiderMonkey JavaScript engine."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "1.76.0"

RPM_NAME = "libgjs-devel-1.76.0-1.1.aarch64.rpm"
RPM_HASH = "b074a616bfcd1ab6101a6f59f39b6d420cc2e666265faed269dca3829960333cc1589294290dc5b957675f38add446b24d1a239e8cd5d95ededa3496d01022db"

RPROVIDES:${PN} += "gjs-devel \
libgjs-devel \
pkgconfig-gjs-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gjs \
libgjs0 \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-cairo-xlib \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gobject-introspection-1.0 \
pkgconfig-gthread-2.0 \
pkgconfig-libffi \
pkgconfig-mozjs-102 \
typelib-1-0-GjsPrivate-1-0"

inherit rpm
