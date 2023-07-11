SUMMARY = "Introspection bindings for Evolution Data Server's Messaging Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package provides the GObject Introspection bindings for library for messaging."
LICENSE = "LGPL-2.0-only"

PV = "3.48.4"

RPM_NAME = "typelib-1_0-Camel-1_2-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "bbddca29dd4febf53e5321af01f566fee6b927d185093743c1e88d36548690b9fcc5320d708c6e9b7258bb48b0710d6b62c4ddce6bddc1e5c8184b9944c1f5b2"

RPROVIDES:${PN} += "typelib-1-0-Camel-1-2 \
typelib-Camel"

RDEPENDS:${PN} += "libcamel-1.2.so.64 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-libxml2"

inherit rpm
