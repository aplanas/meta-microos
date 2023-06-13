SUMMARY = "Configuration application for VNC session"
DESCRIPTION = "This is configuration application to configure sharing and security from inside VNC session."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "vncmanager-controller-gnome-1.0.1-6.7.aarch64.rpm"
RPM_HASH = "211cd9ffc78e35b94eb1c10cd320479b333a9b3257cb6bb400510542ef73522a9fd1bd00a3a79145cdda24f851fcf61977ae47df9f4219602e5970ca31b25c77"

RPROVIDES:${PN} += "vncmanager-controller-gnome \
vncmanager-controller-gnome(aarch-64)"

RDEPENDS:${PN} += "gnome-shell \
vncmanager-controller"

inherit rpm
