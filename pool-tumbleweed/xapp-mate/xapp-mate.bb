SUMMARY = "Mate status applet with HIDPI support"
DESCRIPTION = "Mate status applet with HIDPI support"
LICENSE = "GPL-3.0-or-later"

PV = "2.6.1"

RPM_NAME = "xapp-mate-2.6.1-1.1.aarch64.rpm"
RPM_HASH = "ea70e4d0cc8eedbd627e8eaa25a948d1a4bcecd825da22be0832fb3c01f696a0eb7c57c31217536111e9d1ff4c3da24c7dd281e0c0d3ed8af8ce2959e444be12"

RPROVIDES:${PN} += "xapp-mate \
xapps-mate"

RDEPENDS:${PN} += "/usr/bin/python3 \
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
