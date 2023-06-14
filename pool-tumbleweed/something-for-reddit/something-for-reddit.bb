SUMMARY = "Browse Reddit from GNOME"
DESCRIPTION = "This is a Reddit client, built with Gtk+ and optimized for GNOME."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.2"

RPM_NAME = "something-for-reddit-0.2.2-1.6.noarch.rpm"
RPM_HASH = "368f05a19e64dc17dad7d4599b5d8b9b870936cac146b4d9350503ffc8a70af5a26675ed761d20c724e6572b703a536393fb88e66283992666fb85d34b46f24f"
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
