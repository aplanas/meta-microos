SUMMARY = "Settings Manager for Compiz (CCSM)"
DESCRIPTION = "Compiz Config and Settings tool (CCSM)."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compizconfig-settings-manager-0.8.18-2.11.noarch.rpm"
RPM_HASH = "bb0124d377f048e2691aeb16a26cd92efeb1e1f2a4f7e66c524c7f604340f09dd09279b97719031ffc41cf558ea3830dce8532b670e033f415eba53b37cf2122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ccsm \
compizconfig-settings-manager"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-ccm \
typelib-GLib \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo"

inherit rpm
