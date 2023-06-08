SUMMARY = "Menu editor for GNOME"
DESCRIPTION = "Alacarte is a simple freedesktop.org compliant menu editor for GNOME \
that lets you change your menus, simply and quickly. Just click and \
type to edit, add, and delete any menu entry."
LICENSE = "LGPL-2.1-or-later"

PV = "3.44.2"

RPM_NAME = "alacarte-3.44.2-1.3.noarch.rpm"
RPM_HASH = "190eb61b1b22fc594ea8c07b9df76d11ffdefd7245faa32a5e5d7e0e2e4e5a0713f8fedd23b01effd6835e5f2d864dc64fd4f9dd7259c4bd9e422b3dd14d3ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alacarte application() application(alacarte.desktop)"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-gobject-Gdk typelib(GLib) typelib(GMenu) typelib(GObject) typelib(Gdk) typelib(GdkPixbuf) typelib(Gtk)"

inherit rpm
