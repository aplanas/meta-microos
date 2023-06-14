SUMMARY = "Mate status applet with HIDPI support"
DESCRIPTION = "Mate status applet with HIDPI support"
LICENSE = "GPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "xapps-mate-2.4.1-1.3.aarch64.rpm"
RPM_HASH = "0bdd877fb0beafa7ee556b1ae68c6817608f6691c836110291310f116b1c30536e3694223a6622fe4026459599468dbc75dd536b25564ead5e004a06ab2cf893"

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
