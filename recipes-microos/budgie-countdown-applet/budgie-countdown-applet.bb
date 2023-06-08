SUMMARY = "Countdown applet"
DESCRIPTION = "A count down applet with the following options: ring a bell, flash the (panel) icon, display a message window or run a (any) command. \
The applet also offers the option to overrule possible user settings on suspend, to keep the clock going while time is running."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-countdown-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "72d1a531bc6f61cd28d87f3cb01a8c397965d3b5ceecf9be35299899ab03bbd43ac665f145a95b5ec45ec019f433db560e6a2df74960c0bdbf3a5a78b8c8062f"

RPROVIDES:${PN} += "budgie-countdown-applet budgie-countdown-applet(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 python3-gobject-Gdk python3-psutil sound-theme-freedesktop typelib(Budgie) typelib(GLib) typelib(GObject) typelib(GdkPixbuf) typelib(Gio) typelib(Gtk) vorbis-tools zenity"

inherit rpm
