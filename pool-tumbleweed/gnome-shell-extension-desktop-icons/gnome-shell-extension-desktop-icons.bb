SUMMARY = "Desktop icon support for GNOME Shell"
DESCRIPTION = "This package provides a GNOME Shell extension for showing the contents \
of ~/Desktop on the desktop of the Shell. Common file management \
operations such as launching, copy/paste, rename and deleting are \
supported."
LICENSE = "GPL-3.0-or-later"

PV = "20.10.0"

RPM_NAME = "gnome-shell-extension-desktop-icons-20.10.0-3.7.noarch.rpm"
RPM_HASH = "e4c8c03608ea494e6e055e065fc8fe6e50c5ee547a52c9a545d0b74179ec864df2ffcb8fee1cc3375d33831fd56de24af862bd937cf82563d01e0900bd330529"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-desktop-icons"

RDEPENDS:${PN} += "/usr/bin/gjs \
gnome-shell \
nautilus \
typelib-Clutter \
typelib-Cogl \
typelib-GLib \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-GnomeDesktop \
typelib-Gtk \
typelib-Meta \
typelib-Pango \
typelib-Shell \
typelib-St \
xdg-desktop-portal-gtk"

inherit rpm
