SUMMARY = "Document Viewer, Mobile UI"
DESCRIPTION = "Document viewing program; supports document in PDF, PS and \
many other formats. This contains the UI targeted at mobile devices with a \
touch screen."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "okular-mobile-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "6ee4976408f5f232357b97df3ed58dfe79e706c591b3b337f321d20a99879386dec7d4038397dd73e95e0645a144d90685cdce3a6f77ab094990ea477f810e43"

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
libOkular5Core.so.11 \
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
