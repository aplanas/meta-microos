SUMMARY = "Menu editor for GNOME"
DESCRIPTION = "Alacarte is a simple freedesktop.org compliant menu editor for GNOME \
that lets you change your menus, simply and quickly. Just click and \
type to edit, add, and delete any menu entry."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.3"

RPM_NAME = "alacarte-3.44.3-1.1.noarch.rpm"
RPM_HASH = "25cad1a706275d036ee1f00c5d820c1f33725054c5c3bf7de6064e0e8ef70aa08ec76d0b766d3cccb92046a290d0d32a6c4f34f268c3812d508cf19ac0c9732c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacarte"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-gobject-Gdk \
typelib-GLib \
typelib-GMenu \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk"

inherit rpm
