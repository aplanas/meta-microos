SUMMARY = "Keyboard autoswitch applet"
DESCRIPTION = "Keyboard Auto Switch is an applet to use a different input keyboard layout per application. \
Simply set a default layout to be used in general. \
Subsequently, simply set a different layout, with the application's window in front, and an exception for that specific application is remembered."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-keyboard-autoswitch-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "6e0fff9f97497837a6748d58656dfe7cbc00767f49e39f4b5e223e136c7d2cdc9dbbcccf9823f8c61cd22639d649972b28f3283b0f8e101eb23644498d19c513"

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
