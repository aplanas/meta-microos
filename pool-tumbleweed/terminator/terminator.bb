SUMMARY = "Store and run multiple GNOME terminals in one window"
DESCRIPTION = "Multiple GNOME terminals in one window.  This is a project to produce \
an efficient way of filling a large area of screen space with \
terminals. This is done by splitting the window into a resizeable \
grid of terminals. As such, you can  produce a very flexible \
arrangements of terminals for different tasks."
LICENSE = "GPL-2.0-only"

PV = "2.1.3"

RPM_NAME = "terminator-2.1.3-1.3.noarch.rpm"
RPM_HASH = "2108afb7b96bc6ba18b427d4ba5ff5c2383b1978424e556c04c88dabf3647850689569554f6bc728b7956d5f4b1381000dca96ed65f950cb572a930396946b5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-terminator \
python3dist-terminator \
terminator"

RDEPENDS:${PN} += "/usr/bin/python3 \
gsettings-desktop-schemas \
hicolor-icon-theme \
python-abi \
python3-cairo \
python3-configobj \
python3-dbus-python \
python3-gobject \
python3-gobject-Gdk \
python3-psutil \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-Keybinder \
typelib-Notify \
typelib-Pango \
typelib-Vte \
typelib-cairo"

inherit rpm
