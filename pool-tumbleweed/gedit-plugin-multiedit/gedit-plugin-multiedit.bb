SUMMARY = "Gedit multiedit plugin"
DESCRIPTION = "The gedit multiedit plugin"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-multiedit-44.1-1.3.aarch64.rpm"
RPM_HASH = "befb47177d971bfbff82dc8aee0d9cd961607317082a02d3c2a03740d8708bdd407c8d63bb2b62b2d3c34b32d7a6f34ce7d5adf693331e8509fb0031656ab416"

RPROVIDES:${PN} += "gedit-plugin-multiedit \
gedit-plugin-multiedit(aarch-64) \
gedit-plugins:/usr/lib64/gedit/plugins/multiedit.plugin \
metainfo() \
metainfo(gedit-multiedit.metainfo.xml)"

RDEPENDS:${PN} += "gedit-plugins-data \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(Gedit) \
typelib(Gio) \
typelib(Gtk) \
typelib(Pango) \
typelib(PangoCairo)"

inherit rpm
