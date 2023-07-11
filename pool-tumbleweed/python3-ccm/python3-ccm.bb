SUMMARY = "CompizConfig Manager Backend"
DESCRIPTION = "The backend to Compiz Config Manager."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "python3-ccm-0.8.18-2.11.noarch.rpm"
RPM_HASH = "15f3b7b2628964b6f817941c0ca8a67e1b899692dd8bc0558f3d4a8110253d137c1abd589f0c85920d36862a0309e1c2de9801e5cf23ff77d96e8236a3be85c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ccm \
python3.11dist-ccsm \
python3dist-ccsm"

RDEPENDS:${PN} += "compiz \
compizconfig-settings-manager-common \
python-abi \
python3-cairo \
python3-compizconfig \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-xml \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo"

inherit rpm
