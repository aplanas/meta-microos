SUMMARY = "Simple settings manager for Compiz"
DESCRIPTION = "Compiz settings manager focused on simplicity for an end-user."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "simple-ccsm-0.8.18-2.10.noarch.rpm"
RPM_HASH = "fdf1056e658b3e46a36f98406230cfc0c839c983760c51d69b10df61306ca1e8e728d7b4e05b72e9bcafeeb3a52853fc056c555d6990cac4296198cebedf5697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(simple-ccsm.desktop) \
ccsm \
metainfo() \
metainfo(simple-ccsm.appdata.xml) \
python3.10dist(simple-ccsm) \
python3dist(simple-ccsm) \
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
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(Gio) \
typelib(Gtk) \
typelib(Pango) \
typelib(PangoCairo)"

inherit rpm
