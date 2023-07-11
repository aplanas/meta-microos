SUMMARY = "Music Player for GNOME"
DESCRIPTION = "Music player and management application for GNOME."
LICENSE = "LGPL-2.1-or-later & SUSE-GPL-2.0-with-plugin-exception"

PV = "44.0"

RPM_NAME = "gnome-music-44.0-1.2.noarch.rpm"
RPM_HASH = "21d10c995d29f1a859e5be4f8810e5b211a0f6caeed948a30fc6e1994ee0166d7d318e1d49b840300da56050f837eee5d89a8f121117205a9e8debda80359541"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-music"

RDEPENDS:${PN} += "/usr/bin/python3 \
dbus-1-python3 \
grilo-plugin-tracker \
python-abi \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-requests \
tracker \
tracker-miner-files \
typelib-Adw \
typelib-GIRepository \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Goa \
typelib-Graphene \
typelib-Grl \
typelib-Gsk \
typelib-Gst \
typelib-GstPbutils \
typelib-GstTag \
typelib-Gtk \
typelib-MediaArt \
typelib-Soup \
typelib-Tracker"

inherit rpm
