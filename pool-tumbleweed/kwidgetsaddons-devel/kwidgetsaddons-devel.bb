SUMMARY = "Large set of desktop widgets: Build Environment"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module. If you are porting applications from \
KDE Platform 4 'kdeui' library, you will find many of its classes here. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kwidgetsaddons-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "eebb520387819802bf633aff3e3a8f1c265426e8db63df12050d24bd1f3c62d09638589b1872781fc1090d6194da573eb882609aede870281f658df10901d3ac"

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
