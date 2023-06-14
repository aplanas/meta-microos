SUMMARY = "Music Player for GNOME"
DESCRIPTION = "Music player and management application for GNOME."
LICENSE = "LGPL-2.1-or-later & SUSE-GPL-2.0-with-plugin-exception"

PV = "44.0"

RPM_NAME = "gnome-music-44.0-1.1.noarch.rpm"
RPM_HASH = "c7761042bc4905e0066c4a06dbe2bdec37b62e8f1c02a5411701a5041956ce6902aa510a0509e418de6cc28805c8733a7bc430e3e6c4620bde0df6c50a481337"
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
