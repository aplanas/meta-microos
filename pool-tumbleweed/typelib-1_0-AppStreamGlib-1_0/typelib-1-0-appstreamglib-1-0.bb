SUMMARY = "Introspection bindings for the AppStream abstraction library"
DESCRIPTION = "This library provides GObjects and helper methods to read and write \
AppStream metadata. It also provides a DOM implementation to edit \
nodes and convert to and from the standardized XML representation."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "typelib-1_0-AppStreamGlib-1_0-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "45bafdbec46da2ac68d1167223824dda03b584fe9a87db5898a25b6ff71687ea085ab14e130b06657a5a85435c90fb2acd722921eb20789dd6df5eaa32fbfc80"

RPROVIDES:${PN} += "typelib-1-0-AppStreamGlib-1-0 \
typelib-AppStreamGlib"

RDEPENDS:${PN} += "libappstream-glib.so.8 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio"

inherit rpm
