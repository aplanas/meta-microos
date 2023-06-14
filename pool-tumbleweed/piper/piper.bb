SUMMARY = "Configuration UI for gaming mice"
DESCRIPTION = "Piper is a GTK+ application to configure gaming mice. It is a graphical frontent \
to the ratbagd DBUS daemon which provides the actual configuration support for the \
devices to any user in the group 'games'."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "piper-0.7-2.1.noarch.rpm"
RPM_HASH = "3d43ae80bb195e3516882a73322cfb862374ac4bef9b7cb373829030f9b1e842b54be5498a707f4d0f87a7fb8c69aaeeb9df951b0101b5b0617657f24d183348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "piper"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-cairo \
python3-evdev \
python3-gobject \
python3-gobject-Gdk \
python3-lxml \
ratbagd \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Rsvg"

inherit rpm
