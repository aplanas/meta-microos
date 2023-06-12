SUMMARY = "Devhelp plugin for Gedit"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the Devhelp plugin for gedit."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "gedit-plugin-devhelp-43.0-2.1.aarch64.rpm"
RPM_HASH = "bef6f97097965bb8b4c5f7b7136c45528604ca560c45a7cfc1db761ffb54b9ff1016c4e61fc31c43209afb3aaaaeeb644d7b86018b55bee20dc046b73ac68167"

RPROVIDES:${PN} += "gedit-plugin-devhelp \
gedit-plugin-devhelp(aarch-64)"
RDEPENDS:${PN} += "devhelp \
gedit \
typelib(GObject) \
typelib(Gedit) \
typelib(Gio) \
typelib(Gtk)"

inherit rpm
