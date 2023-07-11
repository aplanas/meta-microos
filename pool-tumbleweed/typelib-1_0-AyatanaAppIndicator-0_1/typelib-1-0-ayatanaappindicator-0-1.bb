SUMMARY = "Ayatana application indicators library"
DESCRIPTION = "This package contains the GObject Introspection bindings for the \
ayatana appindicator library."
LICENSE = "GPL-3.0-only & LGPL-2.0-only & LGPL-3.0-only"

PV = "0.5.91"

RPM_NAME = "typelib-1_0-AyatanaAppIndicator-0_1-0.5.91-1.5.aarch64.rpm"
RPM_HASH = "85140596b9784663ecb9928115375e0da999e33d6f6ebd3a784abe6694e63e6ec45d2b2b59809ba680d1b8c156b3accd8aea9d0d1dfce120b28401800287e3e2"

RPROVIDES:${PN} += "typelib-1-0-AyatanaAppIndicator-0-1 \
typelib-AyatanaAppIndicator"

RDEPENDS:${PN} += "libayatana-appindicator.so.1 \
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
typelib-freetype2"

inherit rpm
