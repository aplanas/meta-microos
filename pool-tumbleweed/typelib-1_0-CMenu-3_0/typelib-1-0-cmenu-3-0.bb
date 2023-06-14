SUMMARY = "Libcinnamon-menu API -- Introspection bindings"
DESCRIPTION = "cinnamon-menus is an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org. This package also contains \
the Cinnamon menu layout configuration files, .directory files and \
assorted menu related utility programs, Python bindings, and a \
simple menu editor. \
 \
This package provides the GObject Introspection bindings for \
cinnamon-menus."
LICENSE = "LGPL-2.1-or-later"

PV = "5.8.0"

RPM_NAME = "typelib-1_0-CMenu-3_0-5.8.0-1.1.aarch64.rpm"
RPM_HASH = "10258600c3f9f93de38be2180460cdd77854ffa23d41b101c61c72d3bdcb9fd6558e1f40adda506c69a0af14ad9a45b9164b3ed43d26469c3ae3d8ba707ce80b"

RPROVIDES:${PN} += "typelib-1-0-CMenu-3-0 \
typelib-1-0-CinnamonMenu-3-0 \
typelib-CMenu"

RDEPENDS:${PN} += "libcinnamon-menu-3.so.0 \
typelib-GLib \
typelib-GObject \
typelib-Gio"

inherit rpm
