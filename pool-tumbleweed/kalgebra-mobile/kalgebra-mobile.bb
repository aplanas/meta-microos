SUMMARY = "Math Expression Solver and Plotter - mobile version"
DESCRIPTION = "KAlgebra is a math expression solver and plotter. This package includes \
a QtQuick based version for use in mobile (phone, tablet) environments."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kalgebra-mobile-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "6ecfa9533211471e96e6bd69ec826d697ad9eac4cb0a02e2a800af4972a7da82e537c6c053164e5139373c3b483c3fb15c74c149c02d76c8ad1e59572b37496b"

RPROVIDES:${PN} += "application() \
application(org.kde.kalgebramobile.desktop) \
kalgebra-mobile \
kalgebra-mobile(aarch-64) \
metainfo() \
metainfo(org.kde.kalgebramobile.appdata.xml) \
mimehandler(application/x-kalgebra)"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libAnalitza.so.8()(64bit) \
libAnalitzaPlot.so.8()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libqt5-qtquickcontrols2 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
