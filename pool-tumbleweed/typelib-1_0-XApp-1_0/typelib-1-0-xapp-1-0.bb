SUMMARY = "XApp library -- Introspection bindings"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions. \
 \
This library is used by several XApp applications."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.1"

RPM_NAME = "typelib-1_0-XApp-1_0-2.6.1-1.1.aarch64.rpm"
RPM_HASH = "a613d193b1119bf448e82d43910cacc6e2303833c885f3b4294bc4f336f0c501c1b22767b693ec65284f8e1d5e80099b288db673e528fca75d047c2538ab67c3"

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
