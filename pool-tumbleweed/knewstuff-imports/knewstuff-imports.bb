SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "knewstuff-imports-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "39661014ec0aa410d1d82979ece677e8ba073578b34cf1c88a6b9fdf636b7fc14b788d60c1c93b4180af094fa5ee100ad29e6a5ce58139f9cd5082ce14ebbd0d"

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
