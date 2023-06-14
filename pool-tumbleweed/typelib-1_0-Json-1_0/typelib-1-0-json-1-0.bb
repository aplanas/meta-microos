SUMMARY = "Introspection bindings for libjson-glib"
DESCRIPTION = "JSON-GLib provides a parser and a generator GObject classes and various \
wrappers for the complex data types employed by JSON, such as arrays \
and objects. \
 \
This package provides the GObject Introspection bindings for JSON-GLib."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.6"

RPM_NAME = "typelib-1_0-Json-1_0-1.6.6-2.8.aarch64.rpm"
RPM_HASH = "480611a336d05cf2a4d5ba6d54233fd4d4fec47503d095abea17221035fe983080dcec27e813711ffe0b52d926b17e7f526e4586db9682d4af74c0a9ffd8c3f7"

RPROVIDES:${PN} += "typelib-1-0-Json-1-0 \
typelib-Json"

RDEPENDS:${PN} += "libjson-glib-1.0.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
