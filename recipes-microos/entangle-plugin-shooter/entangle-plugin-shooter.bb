SUMMARY = "Repeated batch mode shooting"
DESCRIPTION = "Entangle provides a graphical interface for 'tethered shooting', aka \
taking photographs with a digital camera completely controlled from \
the computer. \
 \
This package provides the shooter plugin for entangle."
LICENSE = "GPL-3.0-or-later"

PV = "3.0"

RPM_NAME = "entangle-plugin-shooter-3.0-2.8.aarch64.rpm"
RPM_HASH = "69b2407156fc0c6bb1b237c78902fc1db15fb7ca6950f5a778f274f4f42b886df33d07e65a76db0af316cd7840fb2b0309782dabcdccada974a4f1fb2352ffa6"

RPROVIDES:${PN} += "entangle-plugin-shooter entangle-plugin-shooter(aarch-64)"
RDEPENDS:${PN} += "entangle python3 python3-gobject python3-gobject-Gdk typelib(Entangle) typelib(GExiv2) typelib(GLib) typelib(GObject) typelib(Gdk) typelib(Gio) typelib(GstBase) typelib(Gtk) typelib(Peas) typelib(PeasGtk)"

inherit rpm
