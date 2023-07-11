SUMMARY = "Caja extension to enable an embedded terminal"
DESCRIPTION = "Caja Terminal is an embedded terminal for Caja, the MATE file \
manager. It embeds a terminal pane into Caja that is accessible by \
a hotkey (Ctrl+Shift+T) and automatically follows the currently \
active directory in Caja."
LICENSE = "GPL-3.0-or-later"

PV = "0.10"

RPM_NAME = "caja-extension-terminal-0.10-3.7.noarch.rpm"
RPM_HASH = "8e9b54aba132a72f6ff995b657ba3fa1c749cf777b69af58183a63632085555f798ed20caa300a7a0b963f0ebbc3cc5f0a478bfffca0385f0342c675f5d36447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caja-extension-terminal"

RDEPENDS:${PN} += "/usr/bin/python3 \
caja \
python-caja \
python3-gobject \
python3-gobject-Gdk \
python3-pyxdg \
typelib-Caja \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gtk \
typelib-Pango \
typelib-Vte"

inherit rpm
