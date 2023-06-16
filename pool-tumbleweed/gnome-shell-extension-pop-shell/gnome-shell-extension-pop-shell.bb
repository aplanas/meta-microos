SUMMARY = "Gnome Shell Extension to Auto Tiling"
DESCRIPTION = "Pop Shell is a keyboard-driven layer for GNOME Shell which allows for quick and \
sensible navigation and management of windows. The core feature of Pop Shell is \
the addition of advanced tiling window management — a feature that has been \
highly-sought within our community. For many — ourselves included — i3wm has \
become the leading competitor to the GNOME desktop. \
 \
Tiling window management in GNOME is virtually nonexistent, which makes the \
desktop awkward to interact with when your needs exceed that of two windows at \
a given time. Luckily, GNOME Shell is an extensible desktop with the \
foundations that make it possible to implement a tiling window manager on top \
of the desktop. \
 \
Therefore, we see an opportunity here to advance the usability of the GNOME \
desktop to better accomodate the needs of our community with Pop Shell. \
Advanced tiling window management is a must for the desktop, so we've merged \
i3-like tiling window management with the GNOME desktop for the best of both \
worlds."
LICENSE = "GPL-3.0-only"

PV = "1.2.0"

RPM_NAME = "gnome-shell-extension-pop-shell-1.2.0-6.3.noarch.rpm"
RPM_HASH = "e4517c1ebdb49f84c895b81c81f83a184f2cc013eae3b4d8bec77aa2568d1cc46006f32eb78a3315c076890618906df96a861ddc3ce90e6df9760e4d62c66de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-pop-shell"

RDEPENDS:${PN} += "/usr/bin/sh \
gnome-shell \
typelib-Clutter \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Meta \
typelib-Pango \
typelib-Shell \
typelib-St"

inherit rpm
