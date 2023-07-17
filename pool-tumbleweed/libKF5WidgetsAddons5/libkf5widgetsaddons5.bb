SUMMARY = "Large set of desktop widgets"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module. If you are porting applications from \
KDE Platform 4 'kdeui' library, you will find many of its classes here."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5WidgetsAddons5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "4f720a7f34df12bebb9b25361321d6903a5bc967d6b4b0976be1c554045fe93d9293a8fb759209a5ef6c6fab043dc5bb57d5f32a58b659c0223883e0b2b91b9a"

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
