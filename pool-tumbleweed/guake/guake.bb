SUMMARY = "Drop-down terminal for GNOME"
DESCRIPTION = "Guake is a dropdown terminal made for the GNOME desktop environment."
LICENSE = "GPL-2.0-only"

PV = "3.9.0"

RPM_NAME = "guake-3.9.0-2.1.noarch.rpm"
RPM_HASH = "1fc18fb42d53a1e06ba66c080456943caded554b3a0c68d27d64a63e03164477d5e5bc0b98d8bb942214c51aef19f546baf985f82cf259a5f0ccabe89a436334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(guake-prefs.desktop) \
application(guake.desktop) \
guake \
metainfo() \
metainfo(guake.desktop.metainfo.xml) \
python3.10dist(guake) \
python3dist(guake)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-cairo \
python3-dbus-python \
python3-gobject-Gdk \
python3-pyaml \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkX11) \
typelib(Gio) \
typelib(Gtk) \
typelib(Keybinder) \
typelib(Notify) \
typelib(Pango) \
typelib(Vte) \
typelib(Wnck)"

inherit rpm
