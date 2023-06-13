SUMMARY = "Mobile settings support for plasma-nm5"
DESCRIPTION = "KConfig Modules and applets for \
wireless connectivity on Plasma Mobile."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.5"

RPM_NAME = "plasma-nm5-mobile-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "e0da3c3d47aad83cc5b091eeb08d75b1f15b278654fd5abcb7fa9e4f4b54bc0132bac780a0864b71698df7009935ef07567e81ea6a85d3c2036db7e906bf59c2"

RPROVIDES:${PN} += "plasma-nm5-mobile \
plasma-nm5-mobile(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5NetworkManagerQt.so.6()(64bit) \
libKF5QuickAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
plasma-nm5 \
qt5qmlimport(QtGraphicalEffects.1) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(org.kde.kcm.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.kde.plasma.core.2) \
qt5qmlimport(org.kde.plasma.networkmanagement.0)"

inherit rpm
