SUMMARY = "Nemo extension to enable an embedded terminal"
DESCRIPTION = "Nemo Terminal is an embedded terminal for Nemo, the Cinnamon file \
manager. It embeds a terminal pane into Nemo that is accessible by \
hotkey (default F4) and automatically follows the currently active \
directory in Nemo."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-terminal-5.2.0-4.1.noarch.rpm"
RPM_HASH = "c1f3a3cf5741db4b645d6f7d1356ddb91f11785bace99e4a31309b1f60994d9d0da3deb207ffe981f9bace8e79ac330ccb320adcf8a651bb2da21400c4f7b8ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-terminal \
nemo-terminal \
python3.11dist-nemo-terminal \
python3dist-nemo-terminal"

RDEPENDS:${PN} += "/usr/bin/python3 \
nemo \
python-abi \
python3-gobject \
python3-gobject-Gdk \
python3-nemo \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Nemo \
typelib-Vte \
typelib-XApp"

inherit rpm
