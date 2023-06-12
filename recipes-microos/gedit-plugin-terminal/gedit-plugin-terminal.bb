SUMMARY = "Gedit terminal plugin"
DESCRIPTION = "The gedit terminal plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-terminal-44.1-1.3.aarch64.rpm"
RPM_HASH = "33f9e0dbe6a97727746b7698f33490de07b0dab9257362368f4b9cc2617f1da473eab0722fd6a71611bc9c08aacb52f7664d9280727d9925bbb03d2545eb28bc"

RPROVIDES:${PN} += "gedit-plugin-terminal \
gedit-plugin-terminal(aarch-64) \
gedit-plugins:/usr/lib64/gedit/plugins/terminal.plugin \
metainfo() \
metainfo(gedit-terminal.metainfo.xml)"
RDEPENDS:${PN} += "gedit-plugins-data \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(Gedit) \
typelib(Gio) \
typelib(Gtk) \
typelib(Pango) \
typelib(Tepl) \
typelib(Vte)"

inherit rpm
