SUMMARY = "Development files for libjson-glib"
DESCRIPTION = "JSON-GLib provides a parser and a generator GObject classes and various \
wrappers for the complex data types employed by JSON, such as arrays \
and objects. \
 \
This package contains development files needed to develop with the \
json-glib library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.6"

RPM_NAME = "json-glib-devel-1.6.6-2.9.aarch64.rpm"
RPM_HASH = "b5a3c92488e794b88e1fefb07674ad5d91370b90871d73c60bc3596a17e5d65e2c2a47459229b38aacaf4856f7973bb34ff6aeac91788aa8671732b6c74e73f3"

RPROVIDES:${PN} += "json-glib-devel \
pkgconfig-json-glib-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1-0-0 \
libjson-glib-1.0.so.0 \
pkgconfig-gio-2.0 \
typelib-1-0-Json-1-0"

inherit rpm
