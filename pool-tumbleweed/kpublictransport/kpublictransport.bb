SUMMARY = "QML imports for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries. QML imports."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kpublictransport-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f7e03eeb3264da92edc71c447fe6911f89224cce80f6bb0fbd79cae62c10b8b5b6201ab9af29c7fbf21a791a80bf309f6a37a1cb3b077d62a9c03abd599723dc"

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
