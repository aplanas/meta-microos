SUMMARY = "Development files for glib, a general-purpose utility library"
DESCRIPTION = "GLib is a general-purpose utility library, which provides many useful \
data types, macros, type conversions, string utilities, file utilities, \
a main loop abstraction, and so on. \
 \
This package contains the development files for GLib."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.5"

RPM_NAME = "glib2-devel-2.76.5-1.1.aarch64.rpm"
RPM_HASH = "39f5390c4744ae058028beba57b7969bafddb5ad243127a7126bc8ac1b8ee7357b89b7b6b390f7392e42906b9bd2c218a8feba2d27f2a44ab4d68b728de075de"

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
