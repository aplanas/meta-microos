SUMMARY = "Nemo extension to enable an embedded terminal"
DESCRIPTION = "Nemo Terminal is an embedded terminal for Nemo, the Cinnamon file \
manager. It embeds a terminal pane into Nemo that is accessible by \
hotkey (default F4) and automatically follows the currently active \
directory in Nemo."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-terminal-5.2.0-3.6.noarch.rpm"
RPM_HASH = "3fad6b6dce1b66f246ec80d072c2c248bac9713931c0193cd8af48d3866983bf6ee15bba4804cbce9e87506f0354afc5de76bb502bd6b95e38bed09d38e0b65c"
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
