SUMMARY = "Mobile settings support for plasma-nm5"
DESCRIPTION = "KConfig Modules and applets for \
wireless connectivity on Plasma Mobile."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "5.27.6"

RPM_NAME = "plasma-nm5-mobile-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "564c4fc176ed3efb9e2813c938683fda0660432533ae6deb11486916b69a857162999a5900080df5c13ab4d2e9319fb2f3f500f1fa02333811a8e8bcccd4d6f0"

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
