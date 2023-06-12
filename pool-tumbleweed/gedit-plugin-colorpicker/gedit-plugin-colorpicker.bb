SUMMARY = "Gedit colorpicker plugin"
DESCRIPTION = "The gedit colorpicker plugin."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-colorpicker-44.1-1.3.aarch64.rpm"
RPM_HASH = "cf7a08a1387d86bf750172faf583d96fe4fa3f82854d024a74ec970bcd58edf327559760bcf734df317b92f20a61bdbec1926c09a34f55743de083a7049d1041"

RPROVIDES:${PN} += "gedit-plugin-colorpicker \
gedit-plugin-colorpicker(aarch-64) \
gedit-plugins:/usr/lib64/gedit/plugins/colorpicker.plugin \
metainfo() \
metainfo(gedit-colorpicker.metainfo.xml)"
RDEPENDS:${PN} += "gedit-plugins-data \
typelib(GObject) \
typelib(Gdk) \
typelib(Gedit) \
typelib(Gio) \
typelib(Gtk)"

inherit rpm
