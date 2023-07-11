SUMMARY = "Introspection bindings for libcolorhug"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides the GObject Introspection bindings for the \
libcolorhug library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "typelib-1_0-Colorhug-1_0-1.4.6-2.4.aarch64.rpm"
RPM_HASH = "ac7ccde1f19e32493a151a4c2547458d27188eb4f24f06dea018e5c508bd25e55f8538b936da2c7db2222785cf9321bca5fe399fec1c5b1e8ee8273133df4d8b"

RPROVIDES:${PN} += "typelib-1-0-Colorhug-1-0 \
typelib-Colorhug"

RDEPENDS:${PN} += "libcolorhug.so.2 \
typelib-Colord \
typelib-GLib \
typelib-GObject \
typelib-GUsb \
typelib-Gio"

inherit rpm
