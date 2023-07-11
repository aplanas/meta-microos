SUMMARY = "Ayatana application indicators library"
DESCRIPTION = "This package contains the GObject Introspection bindings for the \
ayatana appindicator library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.91"

RPM_NAME = "typelib-1_0-AyatanaAppIndicator3-0_1-0.5.91-1.5.aarch64.rpm"
RPM_HASH = "2d3d03da3bf730b4abe7e83cc0e24fd595d373bb83e74313d9c0f29f478eb5018f9fbe1a07b4d675dd15e1b709a89b28c229def85ef55efa255d3a4794fca113"

RPROVIDES:${PN} += "typelib-1-0-AyatanaAppIndicator3-0-1 \
typelib-AyatanaAppIndicator3"

RDEPENDS:${PN} += "libayatana-appindicator3.so.1 \
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
