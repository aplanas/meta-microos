SUMMARY = "Development files for libgit2-glib, a GLib wrapper library around libgit2"
DESCRIPTION = "libgit2-glib is a GLib wrapper library around the libgit2 git access library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libgit2-glib-devel-1.1.0-1.7.aarch64.rpm"
RPM_HASH = "b6f8b938c990fd6f359d180a9f04cdbc59ee648e202cf0eba81a8c01d88c03d7ac67769819459b600f691c4fa0c4ec4d0f2d50eb9e9c033a5b6da1200985be34"

RPROVIDES:${PN} += "libgit2-glib-devel \
pkgconfig-libgit2-glib-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgit2-glib-1-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libgit2 \
typelib-1-0-Ggit-1-0"

inherit rpm
