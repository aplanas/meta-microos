SUMMARY = "Store and run multiple GNOME terminals in one window"
DESCRIPTION = "Multiple GNOME terminals in one window.  This is a project to produce \
an efficient way of filling a large area of screen space with \
terminals. This is done by splitting the window into a resizeable \
grid of terminals. As such, you can  produce a very flexible \
arrangements of terminals for different tasks."
LICENSE = "GPL-2.0-only"

PV = "2.1.3"

RPM_NAME = "terminator-2.1.3-1.2.noarch.rpm"
RPM_HASH = "27dcc7dba29659944b2433aa4199ae1afd8696c712aecaacc06ca6d39bb53cb56fe29bc54019e2825603e1a34f49295b340d6fdf6ddea8344680ee4bb98808e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(terminator.desktop) \
metainfo() \
metainfo(terminator.metainfo.xml) \
python3.10dist(terminator) \
python3dist(terminator) \
terminator"

RDEPENDS:${PN} += "/usr/bin/python3 \
gsettings-desktop-schemas \
hicolor-icon-theme \
python(abi) \
python3-cairo \
python3-configobj \
python3-dbus-python \
python3-gobject \
python3-gobject-Gdk \
python3-psutil \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(GdkX11) \
typelib(Gio) \
typelib(Gtk) \
typelib(Keybinder) \
typelib(Notify) \
typelib(Pango) \
typelib(Vte) \
typelib(cairo)"

inherit rpm
