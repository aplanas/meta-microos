SUMMARY = "QML imports for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries. QML imports."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kpublictransport-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "31c078ee58ba5d1fbf17a7ed70dd6ff1c88521a22e55a606e7e74cb67b906422cc276146f7bea884f06d7ebc272e0f9e0b3c3e2e62b2f2ae4b0fab333dd0a61e"

RPROVIDES:${PN} += "kpublictransport \
libkpublictransportonboardqmlplugin.so \
libkpublictransportqmlplugin.so \
libkpublictransportquickplugin.so \
qt5qmlimport-org.kde.kpublictransport.1 \
qt5qmlimport-org.kde.kpublictransport.onboard.1 \
qt5qmlimport-org.kde.kpublictransport.ui.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKPublicTransport.so.1 \
libKPublicTransport1 \
libKPublicTransportOnboard.so.1 \
libKPublicTransportOnboard1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-org.kde.kpublictransport.1 \
qt5qmlimport-org.kde.kpublictransport.ui.1"

inherit rpm
