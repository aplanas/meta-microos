SUMMARY = "Web browser for GNOME"
DESCRIPTION = "Eolie is a Web browser for the GNOME Desktop. It provides: \
* Firefox sync support \
* Secret password store \
* A modern UI"
LICENSE = "GPL-3.0-or-later"

PV = "0.9.101"

RPM_NAME = "eolie-0.9.101-1.11.noarch.rpm"
RPM_HASH = "aad8176332f2314114727654b66db3a813c0f3a82bcf03ced0b995a1947aa756c60d0e8a2473dd6faa08a0faa7ca4d42a29e16bdfe6366455262bd06c857fa71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eolie"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-cairo \
python3-dateutil \
python3-gobject \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-GtkSpell \
typelib-Handy \
typelib-Pango \
typelib-Secret \
typelib-Soup \
typelib-WebKit2"

inherit rpm
