SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "knewstuff-imports-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "5fb6caa1b086ab3ec8cdb184255a657740848d527a0c63d952cbc517ec0fe59e23add14a3f7ab7a945aa5a7f88c522d4c47c9d525709412ce826012ad59faa7b"

RPROVIDES:${PN} += "knewstuff-imports \
libnewstuffqmlplugin.so \
qt5qmlimport-org.kde.newstuff.1 \
qt5qmlimport-org.kde.newstuff.core.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5NewStuffCore.so.5 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtGraphicalEffects.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.Templates.2 \
qt5qmlimport-QtQuick.Window.2 \
qt5qmlimport-org.kde.kcm.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.kde.newstuff.1 \
qt5qmlimport-org.kde.newstuff.core.1"

inherit rpm
