SUMMARY = "Change a directory or file emblem in Nemo"
DESCRIPTION = "Change a directory or a file emblem in Nemo, the Cinnamon desktop \
file manager."
LICENSE = "GPL-3.0-only"

PV = "5.2.0"

RPM_NAME = "nemo-extension-emblems-5.2.0-3.6.noarch.rpm"
RPM_HASH = "48185c14d1cbca5bf0d4191096b11429aa49e6809a8e888bde279c6f330225080387804e373af28e95fe7129bc7447222c79b04393a67491f5ca52c2aad77d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-emblems \
nemo-extension-emblems \
python3.11dist-nemo-emblems \
python3dist-nemo-emblems"

RDEPENDS:${PN} += "nemo \
python3-gobject \
python3-gobject-Gdk \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-Nemo"

inherit rpm
