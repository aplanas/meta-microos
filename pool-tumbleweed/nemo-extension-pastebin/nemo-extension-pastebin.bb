SUMMARY = "Pastebin extension for Nemo file manager"
DESCRIPTION = "nemo-pastebin is an extension for the Nemo file manager, which \
allows users to send files to pastebins just a right-click away."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-pastebin-5.2.0-3.4.noarch.rpm"
RPM_HASH = "2a8237c511b941baed62c2f063652894eb6d0b7eaf2a23115bbe6cffc767e49e3aed7764dd48698d40ae27c31ac5abcd441dfa686e4cef787509181d9ca22cbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nemo-extension-pastebin \
nemo-pastebin \
python3.10dist(nemo-pastebin) \
python3dist(nemo-pastebin)"

RDEPENDS:${PN} += "/usr/bin/python3 \
nemo \
python3-gobject \
python3-gobject-Gdk \
python3-pyxdg \
typelib(GObject) \
typelib(Gdk) \
typelib(Gio) \
typelib(Gtk) \
typelib(Nemo) \
typelib(Notify)"

inherit rpm
