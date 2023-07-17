SUMMARY = "Large set of desktop widgets: Build Environment"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module. If you are porting applications from \
KDE Platform 4 'kdeui' library, you will find many of its classes here. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kwidgetsaddons-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "77defb4702e207d801971fe7e7e158bbe8e8b56bf58158b80be457078cf5bcf34b69928c4a783bcc52b9e65d94895fdee6e70230cf0aaabf99d5ad2bf68cc985"

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
