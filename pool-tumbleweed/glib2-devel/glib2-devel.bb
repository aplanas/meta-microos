SUMMARY = "Development files for glib, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
This package contains the development files for GLib."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.3"

RPM_NAME = "glib2-devel-2.76.3-1.1.aarch64.rpm"
RPM_HASH = "0c5c72a0b221c935bc1156cea7867d9abba94fa666d520718993c60f48acffd2ca3064ed4cdbdf2a01e6d5a804fc0e4a090217375828e054b9898662c8736c67"

RPROVIDES:${PN} += "glib2-devel \
glib2-devel(aarch-64) \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gmodule-export-2.0) \
pkgconfig(gmodule-no-export-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(gthread-2.0) \
rpm_macro(glib2_gio_module_post) \
rpm_macro(glib2_gio_module_postun) \
rpm_macro(glib2_gio_module_requires) \
rpm_macro(glib2_gsettings_schema_post) \
rpm_macro(glib2_gsettings_schema_postun) \
rpm_macro(glib2_gsettings_schema_requires)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
/usr/bin/python3 \
glib2-tools \
glibc-devel \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libgio-2_0-0 \
libglib-2.0.so.0()(64bit) \
libglib-2_0-0 \
libgmodule-2_0-0 \
libgobject-2.0.so.0()(64bit) \
libgobject-2_0-0 \
libgthread-2_0-0 \
pkgconfig \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-no-export-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libffi) \
pkgconfig(libpcre2-8) \
pkgconfig(libselinux) \
pkgconfig(mount) \
pkgconfig(zlib) \
python3-xml"

inherit rpm
