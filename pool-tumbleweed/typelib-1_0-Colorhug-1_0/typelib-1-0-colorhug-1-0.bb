SUMMARY = "Introspection bindings for libcolorhug"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides the GObject Introspection bindings for the \
libcolorhug library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "typelib-1_0-Colorhug-1_0-1.4.6-4.1.aarch64.rpm"
RPM_HASH = "5f9375f826e23e906ccc5e0a53c7e8b55d3f083f82a1ede43cd2e0d94bcea21e41cbec5450ff5f5f3c4291f3c3969adcca09f4b4bd50b67fa652b9cd452c7e26"

RPROVIDES:${PN} += "typelib-1-0-Colorhug-1-0 \
typelib-Colorhug"

RDEPENDS:${PN} += "libcolorhug.so.2 \
typelib-Colord \
typelib-GLib \
typelib-GObject \
typelib-GUsb \
typelib-Gio"

inherit rpm
