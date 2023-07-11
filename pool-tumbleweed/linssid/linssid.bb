SUMMARY = "Graphical wireless scanning for Linux"
DESCRIPTION = "LinSSID is graphically and functionally similar to Inssider (from \
Microsoft Windows). \
It is written in C++ using Linux wireless tools and Qt5."
LICENSE = "GPL-3.0-only"

PV = "3.6"

RPM_NAME = "linssid-3.6-3.13.aarch64.rpm"
RPM_HASH = "1fb41daaf94fb8faf88647e5af294a1c887fb6f5da7bd27ead443cbccd0cad7241a5feb2d8ed69ecec7cf511ecdb9c44f15c6a11044644833b2f61a29aa14bbb"

RPROVIDES:${PN} += "linssid"

RDEPENDS:${PN} += "iw \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqwt-qt5.so.6.2 \
libstdc++.so.6"

inherit rpm
