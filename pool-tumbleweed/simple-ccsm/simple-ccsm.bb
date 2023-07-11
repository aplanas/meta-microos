SUMMARY = "Simple settings manager for Compiz"
DESCRIPTION = "Compiz settings manager focused on simplicity for an end-user."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "simple-ccsm-0.8.18-2.11.noarch.rpm"
RPM_HASH = "29a606d2b0cf41747fe4e8482b62ae24e9b6a9edc20b925ad13f9f8fe6c43eb6f301534c54f128c93364091bc5ff5cc87b8f3cd78f8e5b69d68a2bbe8875a786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ccsm \
python3.11dist-simple-ccsm \
python3dist-simple-ccsm \
simple-ccsm \
simple-ccsm-kde"

RDEPENDS:${PN} += "/usr/bin/python3 \
compiz \
compiz-plugins \
compiz-plugins-main \
python-rpm-macros \
python3-cairo \
python3-ccm \
python3-compizconfig \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo"

inherit rpm
