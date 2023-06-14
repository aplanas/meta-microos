SUMMARY = "Daemon to use DVB devices -- Totem Plugin"
DESCRIPTION = "DVB Daemon is a daemon written in Vala to setup your DVB devices, \
record and watch TV shows and browse EPG. It can be controlled directly \
via its D-Bus interface or with UI applications that come with it. \
 \
This package contains a Totem plugin to use your DVB devices."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.90"

RPM_NAME = "totem-plugin-gnome-dvb-daemon-0.2.90-4.10.aarch64.rpm"
RPM_HASH = "b24f71157c743cb5238652943ed35dffc1e12fc3fb51c99b3e0d9dbfdc0517d0a6d3637bd5e8d90f8cd8acbf813ca75b97abfa9f9047d4582901b8725badacdb"

RPROVIDES:${PN} += "totem-plugin-gnome-dvb-daemon"

RDEPENDS:${PN} += "python-gnome-dvb-daemon \
totem \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-Peas \
typelib-Totem"

inherit rpm
