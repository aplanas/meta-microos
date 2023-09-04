SUMMARY = "Large set of desktop widgets: Build Environment"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module. If you are porting applications from \
KDE Platform 4 'kdeui' library, you will find many of its classes here. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kwidgetsaddons-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "91a07858cbb6ecf42e1446c3e94dc758e8b095561a7770ef6db2cb52fc853887e66048cc362c497b9e6131ff71c1a4c571fc8e254a0dc952fff5cdfe9695ec62"

RPROVIDES:${PN} += "cmake-KF5WidgetsAddons \
kwidgetsaddons-devel"

RDEPENDS:${PN} += "cmake-Qt5Widgets \
extra-cmake-modules \
ld-linux-aarch64.so.1 \
libKF5WidgetsAddons.so.5 \
libKF5WidgetsAddons5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
