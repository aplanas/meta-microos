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

RPM_NAME = "libjson-glib-1_0-0-1.6.6-2.9.aarch64.rpm"
RPM_HASH = "dfcc91f77bbbc73bcc96df17ebf236f4ccc370fc4a2e1be97b1870fd3e086e9fdb9a96ad6c62ba128db520a1005f261d8a85d51e99463fa783cd8660bb84725f"

RPROVIDES:${PN} += "json-glib \
libjson-glib-1-0-0 \
libjson-glib-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
