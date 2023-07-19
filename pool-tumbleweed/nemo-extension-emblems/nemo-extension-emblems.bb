SUMMARY = "Change a directory or file emblem in Nemo"
DESCRIPTION = "Change a directory or a file emblem in Nemo, the Cinnamon desktop \
file manager."
LICENSE = "GPL-3.0-only"

PV = "5.2.0"

RPM_NAME = "nemo-extension-emblems-5.2.0-4.1.noarch.rpm"
RPM_HASH = "f1e6bf086caba0adeea20f02a820c77e3b4757376373eb14c5189e0c1d7fa140b121cf04e9b7ed67be6c55bbb4321bfcdd009a8fd4cda24c5ac6601608772b32"
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
