SUMMARY = "Pastebin extension for Nemo file manager"
DESCRIPTION = "nemo-pastebin is an extension for the Nemo file manager, which \
allows users to send files to pastebins just a right-click away."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-pastebin-5.2.0-4.1.noarch.rpm"
RPM_HASH = "8902146a9e51872274391837c549d0c4a519a19a4cba54a6275c4c48d1c05dfbcf1377796396ab0ca60a72fdfef4898e8847071062ca4a6e765fa5ed608767d8"
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
