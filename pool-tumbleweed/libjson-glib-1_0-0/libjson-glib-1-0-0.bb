SUMMARY = "Library for JavaScript Object Notation format"
DESCRIPTION = "JSON is a lightweight data-interchange format. It is comparatively \
easy for humans to read and write, and for machines to parse and generate. \
 \
JSON-GLib provides a parser and a generator GObject classes and various \
wrappers for the complex data types employed by JSON, such as arrays \
and objects. \
 \
JSON-GLib uses GLib native data types and the generic value container \
GValue for ease of development. It also provides integration with the \
GObject classes for direct serialization into, and deserialization from, \
JSON data streams."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.6"

RPM_NAME = "libjson-glib-1_0-0-1.6.6-2.8.aarch64.rpm"
RPM_HASH = "71acfee765233a7194be1d8a53ad9dc0c68d52cc52a0fe5259087c24567f46d33e9d9746d86f89a0dda9240f33ea087737873d5aec18811d94bce6492d1b3fbe"

RPROVIDES:${PN} += "json-glib \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libjson-glib-1_0-0 \
libjson-glib-1_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
