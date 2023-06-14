SUMMARY = "Tool for removing unnecessary files, freeing space, and maintaining privacy"
DESCRIPTION = "BleachBit deletes unnecessary files to free valuable disk space and \
maintain privacy. Rid your system of old junk including broken \
menu entries, cache, cookies, localizations, and temporary files. \
Designed for Linux  systems, it wipes clean Bash, Beagle, Epiphany, \
Firefox, Flash, GNOME, Java, KDE, OpenOffice.org, Opera, RealPlayer, \
VIM, XChat, and more."
LICENSE = "GPL-3.0-only"

PV = "4.4.2"

RPM_NAME = "bleachbit-4.4.2-2.1.noarch.rpm"
RPM_HASH = "3fa71b78fedfe7f14eccb64a31a355b32e3698540341586e89a481288e5bef400711cdcca0eb4bde70ff1d243a98799f39f3173c1aad252d4b14367423e88320"
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
