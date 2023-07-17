SUMMARY = "Development files for glib, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
This package contains the development files for GLib."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.4"

RPM_NAME = "glib2-devel-2.76.4-1.1.aarch64.rpm"
RPM_HASH = "1ff8016c6d39863e2a98ab06dde26187b45e41e620cf066206f400133d82b84824018e8c7ddc1795b64a4dc0e41e1104ff31beba1c4e9bc49c341e0fedbed013"

RPROVIDES:${PN} += "glib2-devel \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gmodule-export-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
rpm-macro-glib2-gio-module-post \
rpm-macro-glib2-gio-module-postun \
rpm-macro-glib2-gio-module-requires \
rpm-macro-glib2-gsettings-schema-post \
rpm-macro-glib2-gsettings-schema-postun \
rpm-macro-glib2-gsettings-schema-requires"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
/usr/bin/sh \
glib2-tools \
glibc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2-0-0 \
libgio-2.0.so.0 \
libglib-2-0-0 \
libglib-2.0.so.0 \
libgmodule-2-0-0 \
libgobject-2-0-0 \
libgobject-2.0.so.0 \
libgthread-2-0-0 \
pkgconfig \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libffi \
pkgconfig-libpcre2-8 \
pkgconfig-libselinux \
pkgconfig-mount \
pkgconfig-zlib \
python3-xml"

inherit rpm
