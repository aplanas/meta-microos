SUMMARY = "Daemon to use DVB devices -- Python Library"
DESCRIPTION = "DVB Daemon is a daemon written in Vala to setup your DVB devices, \
record and watch TV shows and browse EPG. It can be controlled directly \
via its D-Bus interface or with UI applications that come with it. \
 \
This package contains a a Python library to use the D-Bus interfaces \
of DVB Daemon."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.90"

RPM_NAME = "python-gnome-dvb-daemon-0.2.90-4.11.aarch64.rpm"
RPM_HASH = "7579bbdc982868f4e9ea805c2554bb91bdd451bd0d51ef9e88f5426cdd37f33028f401955a8216a96191c5d5fc1f7eebd8dacc936dc19b5a8c6a7b4ea9611980"

RPROVIDES:${PN} += "python-gnome-dvb-daemon \
python-gnomedvb"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
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
