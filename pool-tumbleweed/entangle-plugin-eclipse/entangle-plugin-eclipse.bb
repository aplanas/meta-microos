SUMMARY = "Eclipse totality automated capture for corona"
DESCRIPTION = "Entangle provides a graphical interface for 'tethered shooting', aka \
taking photographs with a digital camera completely controlled from \
the computer. \
 \
This package provides the eclipse plugin for entangle."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "entangle-plugin-eclipse-3.0-2.8.aarch64.rpm"
RPM_HASH = "f4ecb1f0ce2a15ec8c36099f023ef6fb8337c1d9ca3d817bb0ee89c298b3b83031ff9695c72e083a5d5aec13bff1bdf0f7e062a8ccae10d756bc619dc6aded02"

RPROVIDES:${PN} += "entangle-plugin-eclipse \
entangle-plugin-eclipse(aarch-64)"
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
