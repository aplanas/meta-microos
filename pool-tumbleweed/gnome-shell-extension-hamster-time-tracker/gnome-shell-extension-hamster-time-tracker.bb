SUMMARY = "Hamster time tracker extension for GNOME Shell"
DESCRIPTION = " \
GNOME Shell extension to track activities in hamster via the main \
GNOME shell menu. Packaged for openSUSE Factory because the \
upstream version on extensions.gnome.org often leaks behind current \
GNOME shell development."
LICENSE = "GPL-3.0-only"

PV = "3.0.3~20_0.10.0_44"

RPM_NAME = "gnome-shell-extension-hamster-time-tracker-3.0.3~20_0.10.0_44-8.1.noarch.rpm"
RPM_HASH = "5cb8ff736bcdd391218cf807dcb846205965de99248c1456590a7bb70be9836bd3de93684715748ac78887b54b853d4647677bb1da2751d9e2f4bfde5023abc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-hamster \
gnome-shell-extension-hamster-time-tracker"

RDEPENDS:${PN} += "gnome-shell \
hamster-time-tracker \
typelib-Clutter \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Meta \
typelib-Shell \
typelib-St"

inherit rpm
