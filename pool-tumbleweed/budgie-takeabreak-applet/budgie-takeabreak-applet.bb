SUMMARY = "Takeabreak applet"
DESCRIPTION = "Budgie TakeaBreak is a pomodoro- like applet, to make sure to take regular breaks from working. \
Options from Budgie Settings include turning the screen upside down, dim the screen, lock screen or show a countdown message on break time. \
The applet can be accessed quickly from the panel to temporarily switch it off."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-takeabreak-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "33c8f0eff99ce96dece83776bfa9401dc9a1fc631e13aa76f9e63c44100d26e1eae08c73446ac4bfca381008345391e3d638f79f048a2d8e2e96ca0eb3ac97cb"

RPROVIDES:${PN} += "budgie-takeabreak-applet"

RDEPENDS:${PN} += "/usr/bin/python3 \
iceauth \
python3-gobject-Gdk \
rgb \
sessreg \
typelib-Budgie \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
xcmsdb \
xgamma \
xhost \
xmodmap \
xrandr \
xrdb \
xrefresh \
xset \
xsetmode \
xsetpointer \
xsetroot \
xstdcmap \
xvidtune"

inherit rpm
