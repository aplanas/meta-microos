SUMMARY = "Advanced MATE menu"
DESCRIPTION = "An advanced menu for MATE. Supports filtering, favourites, \
autosession, and many other features. \
 \
This menu originated in the Linux Mint distribution and has \
been ported to other distributions that ship the MATE Desktop \
Environment."
LICENSE = "GPL-2.0-or-later"

PV = "22.04.2"

RPM_NAME = "mate-menu-22.04.2-1.4.noarch.rpm"
RPM_HASH = "ad07bf85414bfc7bcd79ab307ec8a06ff274bcc91d4bb7eb9c8f729e01e58e9ff4fa1c657788a0023538e3ba721b6e69f07368e35453f50340b1cd72a8c29f1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-menu \
python3.10dist(mate-menu) \
python3dist(mate-menu)"

RDEPENDS:${PN} += "/usr/bin/python3 \
glib2-tools \
gvfs \
mate-menus \
mozo \
python(abi) \
python3-Unidecode \
python3-configobj \
python3-gobject \
python3-gobject-Gdk \
python3-pyxdg \
python3-setproctitle \
python3-xlib \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(GdkX11) \
typelib(Gio) \
typelib(Gtk) \
typelib(MateMenu) \
typelib(MatePanelApplet) \
typelib(Pango) \
xdg-utils"

inherit rpm
