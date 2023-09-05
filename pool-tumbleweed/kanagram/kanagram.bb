SUMMARY = "Anagram Game"
DESCRIPTION = "Kanagram is a letter order game."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kanagram-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7e46c3cc5f618affc09113f89469bda3586af3bd28fd3b5379bea84f0310b58667c455abfa8fefc8311074ed8ad14a6780307f999740b7fd87ad5352a2037238"

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
