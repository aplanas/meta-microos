SUMMARY = "Genealogical Research Software"
DESCRIPTION = "Gramps gives you the ability to record the many details of an \
individual's life as well as the complex relationships between \
various people, places and events. All of your research is kept \
organized, searchable and as precise as you need it to be."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.5"

RPM_NAME = "gramps-5.1.5-1.8.noarch.rpm"
RPM_HASH = "9ebb9880eaa821468e8678e85ba21d9b6c89efac6f11704eeedfcc974a316bf514bd88d5ae785509d4f8d96d2bb8ca591d1979b85a7afb1d2fda3df455ba15dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gramps \
python3.11dist-gramps \
python3dist-gramps"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-bsddb3 \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
typelib-GExiv2 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GeocodeGlib \
typelib-Gio \
typelib-Gtk \
typelib-GtkSpell \
typelib-OsmGpsMap \
typelib-Pango \
typelib-PangoCairo \
xdg-utils"

inherit rpm
