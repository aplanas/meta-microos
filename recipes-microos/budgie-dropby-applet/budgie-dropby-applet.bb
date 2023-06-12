SUMMARY = "DropBy applet"
DESCRIPTION = "The DropBy applet pops up on the occasion of connecting a usb device. \
The applet subsequently offers the option(s) to mount, unmount/eject, and, in case of a flash drive, to make a local copy of the drive's content. \
The info shows the free space on the volume."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-dropby-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "5ff874f7804faad02e76258c214870ed154def0589f55bf5a345ade254a3c13a440986151a549183c230ad8e0c5079aa540731976f559308a32947ad0f2ab31d"

RPROVIDES:${PN} += "budgie-dropby-applet \
budgie-dropby-applet(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gobject-Gdk \
python3-psutil \
python3-pyudev \
typelib(Budgie) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(Gtk) \
typelib(Wnck) \
util-linux \
wmctrl \
zenity"

inherit rpm
