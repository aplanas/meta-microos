SUMMARY = "Application indicators library"
DESCRIPTION = "This package contains the GObject Introspection bindings for the appindicator \
library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "12.10.1~bzr20200706.298"

RPM_NAME = "typelib-1_0-AppIndicator3-0_1-12.10.1~bzr20200706.298-2.4.aarch64.rpm"
RPM_HASH = "4bbe6c8fef22f86bec1558fd946c7fba785752a54045c1d0daec0ddaf6d2aed4695c28609257f1e76e0771d8bdeadb8b2daa2a12767f842a62e175c36b2c1f85"

RPROVIDES:${PN} += "typelib-1-0-AppIndicator3-0-1 \
typelib-AppIndicator3"

RDEPENDS:${PN} += "libappindicator3.so.1 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
