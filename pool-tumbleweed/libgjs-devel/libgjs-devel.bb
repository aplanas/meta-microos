SUMMARY = "Development files for the GJS library"
DESCRIPTION = "This module contains JavaScript bindings based on gobject-introspection and the \
Mozilla SpiderMonkey JavaScript engine."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "1.76.2"

RPM_NAME = "libgjs-devel-1.76.2-1.1.aarch64.rpm"
RPM_HASH = "f355f5c43b41926ecdedf428e210d2d51bbdf0c4b9402f1c96d8896a2c0610ef3f51599ffeae0dd3d6f75188db1125574df0cd48023e8d166ed6fe7e51eb1cdc"

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
