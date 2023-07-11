SUMMARY = "Daemon to use DVB devices -- Totem Plugin"
DESCRIPTION = "DVB Daemon is a daemon written in Vala to setup your DVB devices, \
record and watch TV shows and browse EPG. It can be controlled directly \
via its D-Bus interface or with UI applications that come with it. \
 \
This package contains a Totem plugin to use your DVB devices."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.90"

RPM_NAME = "totem-plugin-gnome-dvb-daemon-0.2.90-4.11.aarch64.rpm"
RPM_HASH = "26354cd6e0b009aef5462a40794e84c2a2e2409e107c1dff2e773318df88b6680cf6cb82833a2a55996c50ef262de2f73ab05fe1cf591230fe115a9603da5316"

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
