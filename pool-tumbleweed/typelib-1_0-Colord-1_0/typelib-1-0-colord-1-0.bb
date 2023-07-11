SUMMARY = "Introspection bindings for libcolord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides the GObject Introspection bindings for the \
libcolord library."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "typelib-1_0-Colord-1_0-1.4.6-2.4.aarch64.rpm"
RPM_HASH = "20f0532c14e6c46214a9e8beb58150f33eed8daf287a922de1057e13ab54c806afd2e35912955751b4a61439ded16ad474b9761aaff15a94fe63886fbc1646a2"

RPROVIDES:${PN} += "typelib-1-0-Colord-1-0 \
typelib-Colord"

RDEPENDS:${PN} += "libcolord.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
