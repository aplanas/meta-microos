SUMMARY = "File manager and desktop icon manager"
DESCRIPTION = "PCManFM-Qt is the Qt port of the LXDE file manager PCManFM"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "pcmanfm-qt-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "fda43a695d897eeb868f6f7b59eb19536dfca78372b2bcb341f1a4b4365fccd480ff5641c1b5d4691eb66746698f26ec5e47b754b8d93e6d071b4caf17fbe334"

RPROVIDES:${PN} += "application() \
application(pcmanfm-qt-desktop-pref.desktop) \
application(pcmanfm-qt.desktop) \
config(pcmanfm-qt) \
mimehandler(inode/directory) \
pcmanfm-qt \
pcmanfm-qt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libfm-qt.so.13()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libxcb.so.1()(64bit) \
menu-cache \
wallpaper-branding-openSUSE"

inherit rpm
