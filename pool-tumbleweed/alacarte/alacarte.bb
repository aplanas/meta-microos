SUMMARY = "Menu editor for GNOME"
DESCRIPTION = "Alacarte is a simple freedesktop.org compliant menu editor for GNOME \
that lets you change your menus, simply and quickly. Just click and \
type to edit, add, and delete any menu entry."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.2"

RPM_NAME = "alacarte-3.44.2-1.4.noarch.rpm"
RPM_HASH = "8e760411ef08927a6f3938ec294599defecafd1c69af324db1917bcc156592f0de5227cde9a3368022e6b2a793dd03c2d6b1179f010b25c0d6263042b268f266"
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
