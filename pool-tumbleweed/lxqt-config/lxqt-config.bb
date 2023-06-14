SUMMARY = "LXQt Control Center"
DESCRIPTION = "System Configuration and Control Center for LXQt"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-config-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "4bddef414040e96f76943011088b32d7cf9cd4b504d2ce4d5c3784dbca73e15017d3cf0d89ba06084cab780186eb535bb7258024f608eb5217a108c2a6618d19"

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
