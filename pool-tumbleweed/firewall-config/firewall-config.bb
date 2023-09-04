SUMMARY = "Firewall configuration application"
DESCRIPTION = "The firewall configuration application provides an configuration interface for \
firewalld."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewall-config-2.0.0-2.1.noarch.rpm"
RPM_HASH = "93756568614cbb209e663774e9bcf2522a23a699761e37878a494f0ef0bf3c3fb15d4276bc2254468f9aa72f1afe6d0528336ea8830c29508219beeea477de3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewall-config"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
firewalld \
hicolor-icon-theme \
python3-gobject-Gdk \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango"

inherit rpm
