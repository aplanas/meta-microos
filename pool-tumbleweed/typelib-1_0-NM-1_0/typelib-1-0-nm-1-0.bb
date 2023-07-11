SUMMARY = "Introspection bindings for the NetworkManager client convenience library"
DESCRIPTION = "This package contains the gi-bindings that make it easier to use some \
Network Manager functionality from applications that use glib. \
 \
This package provides the GObject Introspection bindings for the \
NetworkManager library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.8"

RPM_NAME = "typelib-1_0-NM-1_0-1.42.8-1.1.aarch64.rpm"
RPM_HASH = "9eaea54140b0c6156e003876e30b1132e98f18b1b71769dcbdbc7326c52e6bf5b32a85549a40d5142dcf41b57abad9c13ec07692323272fdbd3f9955311cee27"

RPROVIDES:${PN} += "typelib-1-0-NM-1-0 \
typelib-NM"

RDEPENDS:${PN} += "libnm.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
