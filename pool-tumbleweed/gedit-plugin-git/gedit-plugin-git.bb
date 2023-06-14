SUMMARY = "Gedit git plugin"
DESCRIPTION = "The gedit git plugin."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugin-git-44.1-1.3.aarch64.rpm"
RPM_HASH = "2c7c43a9def34bdb7c53fe71960e7a6e7f91599cc6f2f97068f9f969cf45b7fd57dd1dfd13c94d7fb8c62c085509b9d04978c6806ecc7630d02b9c144b769003"

RPROVIDES:${PN} += "gedit-plugin-git \
gedit-plugins-/usr/lib64/gedit/plugins/git.plugin"

RDEPENDS:${PN} += "gedit-plugins-data \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gedit \
typelib-Ggit \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource"

inherit rpm
