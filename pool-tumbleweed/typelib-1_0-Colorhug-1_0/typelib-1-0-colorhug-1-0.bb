SUMMARY = "Introspection bindings for libcolorhug"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides the GObject Introspection bindings for the \
libcolorhug library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "typelib-1_0-Colorhug-1_0-1.4.6-3.1.aarch64.rpm"
RPM_HASH = "8b20947da7dc0af059fb936c0ec9107800b1d4bd357d604fd910a10b60d4ee165cc0c372d22aeb38a4b9179686f8f1c8fea11a07cb438a8a41f9006a8aa683e5"

RPROVIDES:${PN} += "typelib-1-0-Colorhug-1-0 \
typelib-Colorhug"

RDEPENDS:${PN} += "libcolorhug.so.2 \
typelib-Colord \
typelib-GLib \
typelib-GObject \
typelib-GUsb \
typelib-Gio"

inherit rpm
