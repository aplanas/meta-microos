SUMMARY = "Versatile File Searching Tool"
DESCRIPTION = "Catfish is a GTK+ search utility written in python. Its search is powered by \
/usr/bin/find and /usr/bin/locate, with search suggestions provided by \
zeitgeist."
LICENSE = "GPL-2.0-or-later"

PV = "4.16.4"

RPM_NAME = "catfish-4.16.4-1.4.noarch.rpm"
RPM_HASH = "e62c82899649c2cc9956c14bbbf0b27f442050b97540e8ad21739d6d63468e9056c7acf2fbb377c4c6aa67c05296db84eb61bca07c6667bdaffb8450d9eac5b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "catfish \
python3.11dist-catfish \
python3dist-catfish"

RDEPENDS:${PN} += "/usr/bin/python3 \
findutils-locate \
gdk-pixbuf-loader-rsvg \
gsettings-backend-dconf \
python-abi \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-pexpect \
python3-xml \
sudo \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-Xfconf"

inherit rpm
