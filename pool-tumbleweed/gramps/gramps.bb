SUMMARY = "Genealogical Research Software"
DESCRIPTION = "Gramps gives you the ability to record the many details of an \
individual's life as well as the complex relationships between \
various people, places and events. All of your research is kept \
organized, searchable and as precise as you need it to be."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.6"

RPM_NAME = "gramps-5.1.6-1.1.noarch.rpm"
RPM_HASH = "df00c3466044f4ac090a0ac2163fa80d8186045445fe15d15a4ec16b82ec43eb8045c551080c710d7f5daa65c2c278db38433d48b6f148e8ea968a1693a0bb4f"
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
