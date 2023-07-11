SUMMARY = "Configuration application for VNC session"
DESCRIPTION = "This is configuration application to configure sharing and security from inside VNC session."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "vncmanager-controller-1.0.1-6.8.aarch64.rpm"
RPM_HASH = "00abbd9c9c3323aa07e89258d958f6b47f8941f473851d530bff188eedbf517ae7c265b410444248810dfbf985617d726d84acb59b0a1b077c96d36f7be490b6"

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
