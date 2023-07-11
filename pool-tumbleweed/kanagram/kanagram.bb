SUMMARY = "Anagram Game"
DESCRIPTION = "Kanagram is a letter order game."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kanagram-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e4425f6e4c7ed8fafc64f4eef8ab5638212dbf4935402f1bd70a6999d918d0e29c91b078da8e0d12faf3f5df5a4275d7e8c2936d3e65bcb7bcff0ae4dad68361"

RPROVIDES:${PN} += "kanagram \
kanagram5"

RDEPENDS:${PN} += "kdeedu-data \
ld-linux-aarch64.so.1 \
libKEduVocDocument.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5SonnetCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5TextToSpeech.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtMultimedia.5 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Styles.1"

inherit rpm
