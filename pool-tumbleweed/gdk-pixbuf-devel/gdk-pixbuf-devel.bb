SUMMARY = "Development files for gdk-pixbuf, an image loading library"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter. \
 \
This package contains the development files for gdk-pixbuf."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.10"

RPM_NAME = "gdk-pixbuf-devel-2.42.10-1.5.aarch64.rpm"
RPM_HASH = "8b1ded8ad425c824d420034e06560f271cbc10697f45056b0e67a0636311de939c92e82c47a187b74b59c3a1c57ef3f665261c312ac15c4110c22eb736d4022c"

RPROVIDES:${PN} += "gdk-pixbuf-devel \
pkgconfig-gdk-pixbuf-2.0 \
rpm-macro-gdk-pixbuf-loader-post \
rpm-macro-gdk-pixbuf-loader-postun \
rpm-macro-gdk-pixbuf-loader-requires"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2-0-0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libjpeg \
pkgconfig-libpng \
pkgconfig-libtiff-4 \
pkgconfig-shared-mime-info \
typelib-1-0-GdkPixbuf-2-0 \
typelib-1-0-GdkPixdata-2-0"

inherit rpm
