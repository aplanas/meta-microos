SUMMARY = "Tool for removing unnecessary files, freeing space, and maintaining privacy"
DESCRIPTION = "BleachBit deletes unnecessary files to free valuable disk space and \
maintain privacy. Rid your system of old junk including broken \
menu entries, cache, cookies, localizations, and temporary files. \
Designed for Linux  systems, it wipes clean Bash, Beagle, Epiphany, \
Firefox, Flash, GNOME, Java, KDE, OpenOffice.org, Opera, RealPlayer, \
VIM, XChat, and more."
LICENSE = "GPL-3.0-only"

PV = "4.4.2"

RPM_NAME = "bleachbit-4.4.2-2.2.noarch.rpm"
RPM_HASH = "b2f38aec8af267c23f766f0eb5527a9800963829cfcfdaefab3ee8cf8ab3e5b8e898ae8fdcc8d80ac398e32828bb8c7b17e7cb7f98961da9184e9ec9b6f87a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bleachbit"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3 \
python3-chardet \
python3-gobject \
python3-gobject-Gdk \
python3-xml \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Notify \
xdg-utils"

inherit rpm
