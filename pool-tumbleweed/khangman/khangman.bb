SUMMARY = "Hangman Game"
DESCRIPTION = "Classical hangman game by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "khangman-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "90a2a4198af427227ed3300bc0b2f1a9a6ed0043f8f81034eaf3b49acd0935371019893867ee3378e755dd6b1406ff6e7650ea13935904461d8d9918d2a6f221"

RPROVIDES:${PN} += "config-khangman \
khangman \
khangman5"

RDEPENDS:${PN} += "kdeedu-data \
ld-linux-aarch64.so.1 \
libKEduVocDocument.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5NewStuff.so.5 \
libKF5NewStuffCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtMultimedia.5 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.Styles.1 \
qt5qmlimport-QtQuick.Dialogs.1 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.newstuff.1"

inherit rpm
