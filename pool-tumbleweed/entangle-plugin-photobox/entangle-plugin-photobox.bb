SUMMARY = "Captive interface for public photo box"
DESCRIPTION = "Entangle provides a graphical interface for 'tethered shooting', aka \
taking photographs with a digital camera completely controlled from \
the computer. \
 \
This package provides the photobox plugin for entangle."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "entangle-plugin-photobox-3.0-2.8.aarch64.rpm"
RPM_HASH = "d4961bde814a71f4ec31d681b7378e1fd95d1df9f32a6f758adacd5de98fa5a0c7b15012f83437576b9560f51aba5956f28d3c7061e8529f3905d1de344fdc40"

RPROVIDES:${PN} += "entangle-plugin-photobox \
entangle-plugin-photobox(aarch-64)"

RDEPENDS:${PN} += "entangle \
python3 \
python3-gobject \
python3-gobject-Gdk \
typelib(Entangle) \
typelib(GExiv2) \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(Gio) \
typelib(GstBase) \
typelib(Gtk) \
typelib(Peas) \
typelib(PeasGtk)"

inherit rpm
