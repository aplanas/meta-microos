SUMMARY = "DropBy applet"
DESCRIPTION = "The DropBy applet pops up on the occasion of connecting a usb device. \
The applet subsequently offers the option(s) to mount, unmount/eject, and, in case of a flash drive, to make a local copy of the drive's content. \
The info shows the free space on the volume."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-dropby-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "ae6b641d259f5beee459571d4e14533b65f8655df5bc8a14929a20b42adf1234c11ad4050e7bb36ed05f02b2055c2f117f22e60d399439be1a4f0e7bb46e1e66"

RPROVIDES:${PN} += "budgie-dropby-applet"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gobject-Gdk \
python3-psutil \
python3-pyudev \
typelib-Budgie \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Gtk \
typelib-Wnck \
util-linux \
wmctrl \
zenity"

inherit rpm
