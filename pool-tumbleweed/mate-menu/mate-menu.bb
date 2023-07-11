SUMMARY = "Advanced MATE menu"
DESCRIPTION = "An advanced menu for MATE. Supports filtering, favourites, \
autosession, and many other features. \
 \
This menu originated in the Linux Mint distribution and has \
been ported to other distributions that ship the MATE Desktop \
Environment."
LICENSE = "GPL-2.0-or-later"

PV = "22.04.2"

RPM_NAME = "mate-menu-22.04.2-1.5.noarch.rpm"
RPM_HASH = "ed1cece3ad8943ff1bd9f2dca224dbf4df5aad16359850fe14a346f1c17ed7d9e20382a70cd648c345fdf37de0b6b8a36a36ac278c54fd7221f01ca386c664c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-menu \
python3.11dist-mate-menu \
python3dist-mate-menu"

RDEPENDS:${PN} += "/usr/bin/python3 \
glib2-tools \
gvfs \
mate-menus \
mozo \
python-abi \
python3-Unidecode \
python3-configobj \
python3-gobject \
python3-gobject-Gdk \
python3-pyxdg \
python3-setproctitle \
python3-xlib \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-MateMenu \
typelib-MatePanelApplet \
typelib-Pango \
xdg-utils"

inherit rpm
