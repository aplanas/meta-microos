SUMMARY = "Large set of desktop widgets"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module. If you are porting applications from \
KDE Platform 4 'kdeui' library, you will find many of its classes here."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5WidgetsAddons5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "ac40d409f9b9915fca43524e58e2ed2b5035158cb30a3e94d0cce0783397ba732a2c468178d39125be058ced2d5128160062d691784a96479d8aa3bff1a897f5"

RPROVIDES:${PN} += "libKF5WidgetsAddons.so.5 \
libKF5WidgetsAddons5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
