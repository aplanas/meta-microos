SUMMARY = "Configuration UI for gaming mice"
DESCRIPTION = "Piper is a GTK+ application to configure gaming mice. It is a graphical frontent \
to the ratbagd DBUS daemon which provides the actual configuration support for the \
devices to any user in the group 'games'."
LICENSE = "GPL-2.0-only"

PV = "0.7"

RPM_NAME = "piper-0.7-2.2.noarch.rpm"
RPM_HASH = "8c97bcee3752a312a9d83bc9a219746a6331d218056e333b42ec7e74c97364704ee910b54113e25e9bc993f1aa333a050e44c7430fd71ad861a9f8f99785d29f"
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
