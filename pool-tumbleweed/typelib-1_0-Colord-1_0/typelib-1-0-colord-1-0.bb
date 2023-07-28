SUMMARY = "Introspection bindings for libcolord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides the GObject Introspection bindings for the \
libcolord library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "typelib-1_0-Colord-1_0-1.4.6-3.1.aarch64.rpm"
RPM_HASH = "9d2d56d83ace7f0546db9344d1a78fb8f07b9402a73bf6f0f35c8e8807695ec5ce1f9a6eb3c1ee1b355508f6f933051744df645da44727d6fcaaa2faebefdb8e"

RPROVIDES:${PN} += "typelib-1-0-Colord-1-0 \
typelib-Colord"

RDEPENDS:${PN} += "libcolord.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
