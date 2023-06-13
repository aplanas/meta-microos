SUMMARY = "Large set of desktop widgets: Build Environment"
DESCRIPTION = "This repository contains add-on widgets and classes for applications \
that use the Qt Widgets module. If you are porting applications from \
KDE Platform 4 'kdeui' library, you will find many of its classes here. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kwidgetsaddons-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "a27e2f14b66556f7986a3d5a1ce91fe367e58d937ef3b4fd905eec25777c73e4918bec6ab946f12995266dbaf29c9d497c4dd86042e989ee0d64f0a30d3778b7"

RPROVIDES:${PN} += "cmake(KF5WidgetsAddons) \
kwidgetsaddons-devel \
kwidgetsaddons-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(Qt5Widgets) \
extra-cmake-modules \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WidgetsAddons5 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
