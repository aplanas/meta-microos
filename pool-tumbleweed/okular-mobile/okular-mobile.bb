SUMMARY = "Document Viewer, Mobile UI"
DESCRIPTION = "Document viewing program; supports document in PDF, PS and \
many other formats. This contains the UI targeted at mobile devices with a \
touch screen."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "okular-mobile-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e8d70e0b769207936669434430fd31c2fa08be1c1bb930c076cd3ea42dec8bfc0c37e40a06e425d2c0e00dab22c18cb10fb66dc2ca0693e163de5b036d9f3c93"

RPROVIDES:${PN} += "libokularplugin.so \
okular-mobile \
qt5qmlimport-org.kde.okular.2"

RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1 \
libKF5Bookmarks.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libOkular5Core.so.10 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
okular \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.okular.2"

inherit rpm
