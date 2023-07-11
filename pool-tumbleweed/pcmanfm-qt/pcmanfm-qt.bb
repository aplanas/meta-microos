SUMMARY = "File manager and desktop icon manager"
DESCRIPTION = "PCManFM-Qt is the Qt port of the LXDE file manager PCManFM"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "pcmanfm-qt-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "d49e8e8f374c3c6afc15a95292f7637c47ef825c1f76860ab39b8408bb9a16d47e23b6be87800daf52e83f7e2209833778a45d121e87d7fd2e1bd8ea9952a2ca"

RPROVIDES:${PN} += "config-pcmanfm-qt \
pcmanfm-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libfm-qt.so.13 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6 \
libxcb.so.1 \
menu-cache \
wallpaper-branding-openSUSE"

inherit rpm
