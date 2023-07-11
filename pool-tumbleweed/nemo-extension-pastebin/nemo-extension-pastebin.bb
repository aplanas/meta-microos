SUMMARY = "Pastebin extension for Nemo file manager"
DESCRIPTION = "nemo-pastebin is an extension for the Nemo file manager, which \
allows users to send files to pastebins just a right-click away."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-pastebin-5.2.0-3.6.noarch.rpm"
RPM_HASH = "cd1228cdfe919fad520452135f8d27c2c4b91e30d7b015aa3d225cf71e382fefc76053e92e4fb3b1305e9907f939d4e3ec8e49910eb61dd27bd2e752731c8767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-pastebin \
nemo-pastebin \
python3.11dist-nemo-pastebin \
python3dist-nemo-pastebin"

RDEPENDS:${PN} += "/usr/bin/python3 \
nemo \
python3-gobject \
python3-gobject-Gdk \
python3-pyxdg \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Nemo \
typelib-Notify"

inherit rpm
