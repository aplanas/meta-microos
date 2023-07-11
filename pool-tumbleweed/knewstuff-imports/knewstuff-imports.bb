SUMMARY = "Framework for downloading and sharing additional application data"
DESCRIPTION = "The KNewStuff library implements collaborative data sharing for \
applications. It uses libattica to support the Open Collaboration Services \
specification."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "knewstuff-imports-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "b23439b91f66f6a1c4e04a681273ea0b15d2a3cd31a03e097e4ac7c5f0d114b5789a05d48f451e2c7e2847d6c8cf4014095507ffd19a0af03fe0cdb98916bcce"

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
