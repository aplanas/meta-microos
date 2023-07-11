SUMMARY = "The urfkill glib library-- Introspection bindings"
DESCRIPTION = "Urfkill add-on library to integrate the standard urfkill library with \
the GLib thread abstraction and main loop. \
 \
This package provides the GObject Introspection bindings for urfkill."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "typelib-1_0-Urfkill-0_0-0.5.0-3.7.aarch64.rpm"
RPM_HASH = "4eee9442f5ea74e833f7c8dc96b2d17f7fdc8314ca8b21a9350e18de855c1761a864ae66295e48190395851a8048cc489dffab03fb137c9775428fbfd862c4aa"

RPROVIDES:${PN} += "typelib-1-0-Urfkill-0-0 \
typelib-Urfkill"

RDEPENDS:${PN} += "liburfkill-glib.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
