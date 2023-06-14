SUMMARY = "Document Viewer, Mobile UI"
DESCRIPTION = "Document viewing program; supports document in PDF, PS and \
many other formats. This contains the UI targeted at mobile devices with a \
touch screen."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "okular-mobile-23.04.1-1.2.aarch64.rpm"
RPM_HASH = "999e141f6625a5c49f72ad9ab8c3888f1eeabef8f9c2b5f6f5437ac81f2ed61c8c3689587d784d92ca6b0c89a4e7cc04cdcb54162154d572ce7883fa17481afb"

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
