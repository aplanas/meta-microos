SUMMARY = "Graphical wireless scanning for Linux"
DESCRIPTION = "LinSSID is graphically and functionally similar to Inssider (from \
Microsoft Windows). \
It is written in C++ using Linux wireless tools and Qt5."
LICENSE = "GPL-3.0-only"

PV = "3.6"

RPM_NAME = "linssid-3.6-3.12.aarch64.rpm"
RPM_HASH = "55aedcc6364607e27e64419344d4e948984adeaeeed0ded86998031af1952d3740c1e732b861414ac57419fba5b9db0dfe56f623d6fef1475259791e6b7bbf0b"

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
