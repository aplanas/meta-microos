SUMMARY = "XApp library -- Introspection bindings"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions. \
 \
This library is used by several XApp applications."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "typelib-1_0-XApp-1_0-2.4.1-1.3.aarch64.rpm"
RPM_HASH = "4672f1cfd22c22c493683daf0976bcab4e60485767128828141ea1f9245c93b4506d8aed97343c908d797d644006730598ae1ede4258d71e3b5e6e34d7232d7a"

RPROVIDES:${PN} += "typelib-1-0-XApp-1-0 \
typelib-XApp"

RDEPENDS:${PN} += "libxapp.so.1 \
python-abi \
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
