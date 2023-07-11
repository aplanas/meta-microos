SUMMARY = "Desktop menu editor"
DESCRIPTION = "A desktop menu editor. Budgie, Cinnamon, GNOME, KDE (Plasma), LXDE, LXQt, MATE, \
Pantheon, Unity, and Xfce are supported."
LICENSE = "GPL-3.0-only"

PV = "2.2.3"

RPM_NAME = "menulibre-2.2.3-1.8.noarch.rpm"
RPM_HASH = "4a8ae04be3a3f0afec043ad6619dbed858fdc25a68dcacfd61de7c18a0635c016ef6dff46ab5d7b27172a1c33de91afe9266f8838891f9af14e7cd082a30ac08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "menulibre \
python3.11dist-menulibre \
python3dist-menulibre"

RDEPENDS:${PN} += "/usr/bin/python3 \
gnome-menus \
hicolor-icon-theme \
python-abi \
python3 \
python3-gobject \
python3-psutil \
typelib-GLib \
typelib-GMenu \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
xdg-utils"

inherit rpm
