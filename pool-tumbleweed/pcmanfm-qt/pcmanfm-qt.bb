SUMMARY = "File manager and desktop icon manager"
DESCRIPTION = "PCManFM-Qt is the Qt port of the LXDE file manager PCManFM"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "pcmanfm-qt-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "fda43a695d897eeb868f6f7b59eb19536dfca78372b2bcb341f1a4b4365fccd480ff5641c1b5d4691eb66746698f26ec5e47b754b8d93e6d071b4caf17fbe334"

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
