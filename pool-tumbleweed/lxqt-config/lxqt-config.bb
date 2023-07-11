SUMMARY = "LXQt Control Center"
DESCRIPTION = "System Configuration and Control Center for LXQt"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-config-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "631486e7b4a268dc917bb2cc95355c0f752df1c9c39468ecd6a0e373c9bedc3416bda83f059c8a7cc6b4968d02e976acc1076b9e0c2997b9a7b9dbbff66b1190"

RPROVIDES:${PN} += "config-lxqt-config \
liblxqt-config-cursor.so \
lxqt-config"

RDEPENDS:${PN} += "/sbin/ldconfig \
desktop-file-utils \
ld-linux-aarch64.so.1 \
libKF5Screen.so.8 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xdg.so.3 \
libQt5Xml.so.5 \
libX11.so.6 \
libXcursor.so.1 \
libXfixes.so.3 \
libXi.so.6 \
libc.so.6 \
liblxqt.so.1 \
libstdc++.so.6 \
libudev.so.1 \
libxcb-randr.so.0 \
libxcb.so.1 \
libz.so.1"

inherit rpm
