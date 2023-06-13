SUMMARY = "Rotationlock applet"
DESCRIPTION = "RotationLock is a simple applet that lets you toggle the 'Rotation Lock' feature for Budgie."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-rotation-lock-applet-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "c223de586b4c21c79cd197db96859ef3a08ac2747016dbeea3189cc326f377342f774d37a8e80a58ff7bcfb8b47ca028706fe6a33312c56986d17ed714b17736"

RPROVIDES:${PN} += "budgie-rotation-lock-applet \
budgie-rotation-lock-applet(aarch-64)"

RDEPENDS:${PN} += "python3-gobject-Gdk \
typelib(Budgie) \
typelib(GObject) \
typelib(Gio) \
typelib(Gtk)"

inherit rpm
