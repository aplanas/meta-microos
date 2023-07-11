SUMMARY = "Introspection bindings for libjson-glib"
DESCRIPTION = "JSON-GLib provides a parser and a generator GObject classes and various \
wrappers for the complex data types employed by JSON, such as arrays \
and objects. \
 \
This package provides the GObject Introspection bindings for JSON-GLib."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.6"

RPM_NAME = "typelib-1_0-Json-1_0-1.6.6-2.9.aarch64.rpm"
RPM_HASH = "95b6c728063c8b5b6bea056141326ac8e9ecb3352ba5632d3922d829276aac23c00df8f6243d9f171523609c1796f66c40dd7c7cf7acf5b7e1eb574eb31b41c8"

RPROVIDES:${PN} += "typelib-1-0-Json-1-0 \
typelib-Json"

RDEPENDS:${PN} += "libjson-glib-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
