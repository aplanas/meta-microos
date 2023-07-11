SUMMARY = "Rotationlock applet"
DESCRIPTION = "RotationLock is a simple applet that lets you toggle the 'Rotation Lock' feature for Budgie."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-rotation-lock-applet-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "43e9b8b77dd37e90aca1b84fa27dd79e158f2f81922e9b3b024f6d40d79913f8f65b85182702e639da0f6e18734d936e5c385e977aaf46ea3d89f62f0f835151"

RPROVIDES:${PN} += "budgie-rotation-lock-applet"

RDEPENDS:${PN} += "python3-gobject-Gdk \
typelib-Budgie \
typelib-GObject \
typelib-Gio \
typelib-Gtk"

inherit rpm
