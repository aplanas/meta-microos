SUMMARY = "Large set of desktop widgets"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module. If you are porting applications from \
KDE Platform 4 'kdeui' library, you will find many of its classes here."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5WidgetsAddons5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "3ab41da6b9b9164aeb0ff6669611e2d6d259acfc9739e14d0c0916beb062718bb86ffe7941721c3220ed4b606c8b06b8577ecb7cd7f3c9bed2194c0ee13faaf3"

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
