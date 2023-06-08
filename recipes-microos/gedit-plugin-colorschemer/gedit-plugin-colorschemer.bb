SUMMARY = "Gedit colorschemer plugin"
DESCRIPTION = "The gedit colorschemer plugin."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-colorschemer-44.1-1.3.aarch64.rpm"
RPM_HASH = "2b4e0671f38a542d2c8bea8849670bad1efe8a0cf65952855d4a782516ef909e32301adfc771ed1701e30fc888e9d4b836c546e0908e85b72b64b617e55d09a4"

RPROVIDES:${PN} += "gedit-plugin-colorschemer gedit-plugin-colorschemer(aarch-64) gedit-plugins:/usr/lib64/gedit/plugins/colorschemer.plugin metainfo() metainfo(gedit-colorschemer.metainfo.xml)"
RDEPENDS:${PN} += "gedit-plugins-data typelib(GLib) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gedit) typelib(Gio) typelib(Gtk) typelib(GtkSource) typelib(Pango)"

inherit rpm
