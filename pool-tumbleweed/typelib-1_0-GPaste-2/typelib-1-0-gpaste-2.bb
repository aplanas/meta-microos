SUMMARY = "Introspection bindings for the gpaste clipboard history manager"
DESCRIPTION = "GPaste is a clipboard management daemon with DBus interface. \
 \
This package provides the GObject Introspection bindings for the library \
managing clipboard history."
LICENSE = "BSD-2-Clause"

PV = "43.2+6"

RPM_NAME = "typelib-1_0-GPaste-2-43.2+6-2.2.aarch64.rpm"
RPM_HASH = "9a8538fec7b051b1c105988fb141a92eeb399b56e9d63cf064628240743737a9e898727050ca0e4d503f0da21de6f389c5789ca96f56f02b069634bdfc22b691"

RPROVIDES:${PN} += "typelib-1-0-GPaste-2 \
typelib-GPaste"

RDEPENDS:${PN} += "libgpaste-2.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
