SUMMARY = "Browse Reddit from GNOME"
DESCRIPTION = "This is a Reddit client, built with Gtk+ and optimized for GNOME."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.2"

RPM_NAME = "something-for-reddit-0.2.2-1.7.noarch.rpm"
RPM_HASH = "e97429718a321c0653da27c903243e11f271af295ac22b18fae1bd814e84d74b5f58d8c803961bd6a037b3e019f41c83f20eeeb485fdf31d6586bd0f5f828931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "something-for-reddit"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Markdown \
python3-arrow \
python3-gobject-Gdk \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-Soup \
typelib-WebKit2"

inherit rpm
