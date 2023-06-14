SUMMARY = "Daemon to use DVB devices -- Python Library"
DESCRIPTION = "DVB Daemon is a daemon written in Vala to setup your DVB devices, \
record and watch TV shows and browse EPG. It can be controlled directly \
via its D-Bus interface or with UI applications that come with it. \
 \
This package contains a a Python library to use the D-Bus interfaces \
of DVB Daemon."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.90"

RPM_NAME = "python-gnome-dvb-daemon-0.2.90-4.10.aarch64.rpm"
RPM_HASH = "b876e6b72a0e5b49440b96c2175f4a0b2dcacd210df44200790c2dd0eea7228cb1e64154f09ac2e0b755552ae03402c8e4201fbc835a0b9ef018bcca2262fd71"

RPROVIDES:${PN} += "python-gnome-dvb-daemon \
python-gnomedvb"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
gnome-dvb-daemon \
python-abi \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango"

inherit rpm
