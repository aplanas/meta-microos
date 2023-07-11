SUMMARY = "Screen reader for GNOME"
DESCRIPTION = "Orca is an extensible screen reader that provides access to the \
graphical desktop via user-customizable combinations of speech, \
braille, and/or magnification."
LICENSE = "LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "orca-44.1-1.2.noarch.rpm"
RPM_HASH = "cbe4e63bdd78a148ab971a4ff94ad87d3d9b8dc8a58c9d0e7f23daca01b56d6cc8d6eae97ed755919270f257de6a2903c935feb53adedfba6d26b0f80afc1240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "orca"

RDEPENDS:${PN} += "/usr/bin/python3 \
glib2-tools \
py3atspi \
python-abi \
python3-brlapi \
python3-gobject \
python3-gobject-Gdk \
python3-louis \
python3-speechd \
typelib-Atk \
typelib-Atspi \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkX11 \
typelib-Gio \
typelib-Gst \
typelib-Gtk \
typelib-Pango \
typelib-Wnck"

inherit rpm
