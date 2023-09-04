SUMMARY = "Introspection bindings for libcolord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides the GObject Introspection bindings for the \
libcolord library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "typelib-1_0-Colord-1_0-1.4.6-4.1.aarch64.rpm"
RPM_HASH = "51245e36b5c2231d5e276670f77ff86aa72ca48007377976bbe10ac50236b9b2d63a37fdfd0f87d0bc0fcfa76781547f17f201bf1af2d73563b712b94d96cd12"

RPROVIDES:${PN} += "typelib-1-0-Colord-1-0 \
typelib-Colord"

RDEPENDS:${PN} += "libcolord.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
