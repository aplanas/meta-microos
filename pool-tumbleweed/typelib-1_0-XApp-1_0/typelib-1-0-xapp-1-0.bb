SUMMARY = "XApp library -- Introspection bindings"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions. \
 \
This library is used by several XApp applications."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "typelib-1_0-XApp-1_0-2.4.1-1.4.aarch64.rpm"
RPM_HASH = "d08dd65a8dd93433c53f423ce41cdbaea7a7eef9e9838ae9af24d6d8bf0d07ea40755beb0574f8cedf51d90dc119263863cdcd93ee6bb76a0a49a56e15ca7b12"

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
