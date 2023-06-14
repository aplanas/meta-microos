SUMMARY = "Screen reader for GNOME"
DESCRIPTION = "Orca is an extensible screen reader that provides access to the \
graphical desktop via user-customizable combinations of speech, \
braille, and/or magnification."
LICENSE = "LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "orca-44.1-1.1.noarch.rpm"
RPM_HASH = "1a30f1dac1383cf244bd080dad3f9ed77ace8e855ce640714b62e1792c95545ab3cd3be637d7e8be193bc231087081f4281f7135209b21caa56ee08055eb3cd5"
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
