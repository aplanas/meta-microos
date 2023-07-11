SUMMARY = "A time tracker for GNOME"
DESCRIPTION = "Project Hamster is a time tracker for keeping track on how much time \
is spent during the day on activities that are set up."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "3.0.3~20"

RPM_NAME = "hamster-time-tracker-3.0.3~20-8.1.noarch.rpm"
RPM_HASH = "254fe0a2a1b1113e135b2ed34dacde844b488a33bdb0a100ebcaef2399493b4984574dced5c63acad0a21dd50498ef453cd34c9a1578d8ff22eeb1ded1c4a2fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "docky-hamster-applet \
hamster-applet \
hamster-time-tracker"

RDEPENDS:${PN} += "/usr/bin/python3 \
intltool \
python-abi \
python3-cairo \
python3-dbus-python \
python3-gobject-Gdk \
python3-pyxdg \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-PangoCairo"

inherit rpm
