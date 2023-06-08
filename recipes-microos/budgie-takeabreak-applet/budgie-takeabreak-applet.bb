SUMMARY = "Takeabreak applet"
DESCRIPTION = "Budgie TakeaBreak is a pomodoro- like applet, to make sure to take regular breaks from working. \
Options from Budgie Settings include turning the screen upside down, dim the screen, lock screen or show a countdown message on break time. \
The applet can be accessed quickly from the panel to temporarily switch it off."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-takeabreak-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "ece906fcaf434a123163d94d9360ab405c7d5842226a5a821432b1939cac72bfa372d1f44b5fbad2c4d4139f1b3651e7c6f8209367fb79110b3e86e15adc9eb2"

RPROVIDES:${PN} += "budgie-takeabreak-applet budgie-takeabreak-applet(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 iceauth python3-gobject-Gdk rgb sessreg typelib(Budgie) typelib(GLib) typelib(GObject) typelib(Gio) typelib(Gtk) xcmsdb xgamma xhost xmodmap xrandr xrdb xrefresh xset xsetmode xsetpointer xsetroot xstdcmap xvidtune"

inherit rpm
