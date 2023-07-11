SUMMARY = "Countdown applet"
DESCRIPTION = "A count down applet with the following options: ring a bell, flash the (panel) icon, display a message window or run a (any) command. \
The applet also offers the option to overrule possible user settings on suspend, to keep the clock going while time is running."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-countdown-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "c50dedf6d5508ee510a63a15501c64871ea6a916e74233e7049a6647ca66b4b1ec444aec47bfd7cb08d9e992f098fde5bbbe25db293708a68bc540f0994cd364"

RPROVIDES:${PN} += "budgie-countdown-applet"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gobject-Gdk \
python3-psutil \
sound-theme-freedesktop \
typelib-Budgie \
typelib-GLib \
typelib-GObject \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
vorbis-tools \
zenity"

inherit rpm
