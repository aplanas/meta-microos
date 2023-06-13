SUMMARY = "Development files for libjson-glib"
DESCRIPTION = "JSON-GLib provides a parser and a generator GObject classes and various \
wrappers for the complex data types employed by JSON, such as arrays \
and objects. \
 \
This package contains development files needed to develop with the \
json-glib library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.6"

RPM_NAME = "json-glib-devel-1.6.6-2.8.aarch64.rpm"
RPM_HASH = "5b95c68989b3bb4fbdc84307ab5b9df793f353a22ac784479eae952e87a471e16a235e60f506ae2f557a6cbb06295bd03ca65f7a0ab040906c4b65110b003397"

RPROVIDES:${PN} += "json-glib-devel \
json-glib-devel(aarch-64) \
pkgconfig(json-glib-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1_0-0 \
pkgconfig(gio-2.0) \
typelib-1_0-Json-1_0"

inherit rpm
