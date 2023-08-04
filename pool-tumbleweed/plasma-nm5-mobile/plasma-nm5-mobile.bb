SUMMARY = "Mobile settings support for plasma-nm5"
DESCRIPTION = "KConfig Modules and applets for \
wireless connectivity on Plasma Mobile."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.7"

RPM_NAME = "plasma-nm5-mobile-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "792c5f27f05a110573576b63fb4c5b63418714bb4c088a6f2eac13f50e333662aae4e6d8b2540c6629fb428c704802385c0978290ee12c3616ebdc6b9f15b5f3"

RPROVIDES:${PN} += "plasma-nm5-mobile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5NetworkManagerQt.so.6 \
libKF5QuickAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libstdc++.so.6 \
plasma-nm5 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.plasma.core.2 \
qt5qmlimport-org.kde.plasma.networkmanagement.0"

inherit rpm
