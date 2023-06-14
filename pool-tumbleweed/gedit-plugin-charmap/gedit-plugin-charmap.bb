SUMMARY = "Gedit charmap plugin"
DESCRIPTION = "The gedit charmap plugin."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-charmap-44.1-1.3.aarch64.rpm"
RPM_HASH = "7f789c649120acc98bac9f620e90303cb7ba2572f18c9f5884dd1e2c1ad2f522badde926cd4417cf0e77fce6dcb5fbb909316ef6d66223744b00e0ab67b5beda"

RPROVIDES:${PN} += "gedit-plugin-charmap \
gedit-plugins-/usr/lib64/gedit/plugins/charmap.plugin"

RDEPENDS:${PN} += "gedit-plugins-data \
typelib-GObject \
typelib-Gedit \
typelib-Gio \
typelib-Gtk \
typelib-Gucharmap \
typelib-Pango"

inherit rpm
