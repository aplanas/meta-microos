SUMMARY = "Mate status applet with HIDPI support"
DESCRIPTION = "Mate status applet with HIDPI support"
LICENSE = "GPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "xapps-mate-2.4.1-1.4.aarch64.rpm"
RPM_HASH = "08e31da7ec6cca8f700a191754e066f8c6601de217e0b833574a477c4ca2f6a4ac710adb6e4313d267d9024be960faa01249367c024337ec5fe9e1a52e896a5e"

RPROVIDES:${PN} += "xapps-mate"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdbusmenu-gtk3.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxapp.so.1 \
libxapp1 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-MatePanelApplet \
typelib-XApp"

inherit rpm
