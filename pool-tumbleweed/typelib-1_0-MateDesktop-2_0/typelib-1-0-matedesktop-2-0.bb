SUMMARY = "Common API for various MATE modules typelib"
DESCRIPTION = "This package contains the library with common API for various \
MATE modules."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "typelib-1_0-MateDesktop-2_0-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "856857f5c6a27e79ad917559c6071d0280d0c6b9c77e179be65269762a6c53db08a5aca1d2a585a36b80ce823328c9e44f87c20b7803261db7884181e0442664"

RPROVIDES:${PN} += "typelib-1-0-MateDesktop-2-0 \
typelib-MateDesktop"

RDEPENDS:${PN} += "libmate-desktop-2.so.17 \
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
