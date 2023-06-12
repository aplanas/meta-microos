SUMMARY = "Development files for gdk-pixbuf, an image loading library"
DESCRIPTION = "gdk-pixbuf is an image loading library that can be extended by loadable \
modules for new image formats. It is used by toolkits such as GTK+ or \
Clutter. \
 \
This package contains the development files for gdk-pixbuf."
LICENSE = "LGPL-2.1-or-later"

PV = "2.42.10"

RPM_NAME = "gdk-pixbuf-devel-2.42.10-1.4.aarch64.rpm"
RPM_HASH = "51e4e4fb7393dadbdfc6534db11c8cdb497e39f7d5637fa71a7b9f263e9ea284f9c7d24b665ba359ece06cc100f78efe0b7c23de34049746369aa99cec3f37d2"

RPROVIDES:${PN} += "gdk-pixbuf-devel \
gdk-pixbuf-devel(aarch-64) \
pkgconfig(gdk-pixbuf-2.0) \
rpm_macro(gdk_pixbuf_loader_post) \
rpm_macro(gdk_pixbuf_loader_postun) \
rpm_macro(gdk_pixbuf_loader_requires)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgdk_pixbuf-2_0-0 \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-no-export-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libjpeg) \
pkgconfig(libpng) \
pkgconfig(libtiff-4) \
pkgconfig(shared-mime-info) \
typelib-1_0-GdkPixbuf-2_0 \
typelib-1_0-GdkPixdata-2_0"

inherit rpm
