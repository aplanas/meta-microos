SUMMARY = "Listen to different sounds"
DESCRIPTION = "Improve focus and increase your productivity by listening to different sounds. \
Or allows you to fall asleep in a noisy environment."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.0"

RPM_NAME = "blanket-0.6.0-1.4.noarch.rpm"
RPM_HASH = "d5f651bb85f4e1d2b809578c122c63980327a8f64b809117ec30b4ba9d29619f58a8a60b239ca2eb5405d4f79aea0eecd96c7ccaf9e70266a3e8b14e23c2ae0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(com.rafaelmardojai.Blanket.desktop) blanket metainfo() metainfo(com.rafaelmardojai.Blanket.metainfo.xml)"
RDEPENDS:${PN} += "/usr/bin/python3 typelib(Adw) typelib(GLib) typelib(GObject) typelib(Gdk) typelib(Gio) typelib(Gst) typelib(GstPlayer) typelib(Gtk)"

inherit rpm
