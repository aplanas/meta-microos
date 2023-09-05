SUMMARY = "Configuration application for VNC session"
DESCRIPTION = "This is configuration application to configure sharing and security from inside VNC session."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "vncmanager-controller-1.0.2-1.1.aarch64.rpm"
RPM_HASH = "648e9f314ec5f92d3842375563bdd3063c0c9fad647cb2c7ec9e8430a75e8e08ff7f9b1bb039e014a35b9dda3556783573e3c18f90c24d43dc37cf12ce6ded83"

RPROVIDES:${PN} += "vncmanager-controller"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libXvnc.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
vncmanager"

inherit rpm
