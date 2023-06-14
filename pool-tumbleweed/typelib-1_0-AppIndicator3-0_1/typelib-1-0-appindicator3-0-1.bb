SUMMARY = "Application indicators library"
DESCRIPTION = "This package contains the GObject Introspection bindings for the appindicator \
library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "12.10.1~bzr20200706.298"

RPM_NAME = "typelib-1_0-AppIndicator3-0_1-12.10.1~bzr20200706.298-2.3.aarch64.rpm"
RPM_HASH = "28f159af6cde48185ebd5276ec82b22c6ceed1bc86c1603d35bb4c89ce1afe092d48eb121d0fd9001bdfaa7d2db1cba1412e8af1abf65048daa01a6333d251ab"

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
