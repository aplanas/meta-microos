SUMMARY = "Keyboard autoswitch applet"
DESCRIPTION = "Keyboard Auto Switch is an applet to use a different input keyboard layout per application. \
Simply set a default layout to be used in general. \
Subsequently, simply set a different layout, with the application's window in front, and an exception for that specific application is remembered."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-keyboard-autoswitch-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "21f8443a6d04af758dfe9b71075e8fd97403cc0da38885751ba124abd5f40d57f62a7b6ae5e90918166dd0f78449391b5d65b086380b3c4c3f1f0e48772c2702"

RPROVIDES:${PN} += "budgie-keyboard-autoswitch-applet"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gobject-Gdk \
python3-psutil \
typelib-Budgie \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
wmctrl \
xdpyinfo \
xev \
xlsatoms \
xlsclients \
xlsfonts \
xprop \
xvinfo \
xwininfo"

inherit rpm
