SUMMARY = "QML imports for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries. QML imports."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kpublictransport-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "679c39f744cefe252bff9a883267edb4f853669cbc4cc91f7126786c5f81d58c09ac56a0db191f1ac92f072c0b386a1035a3e6759e0d930ebf1831fdc1b1fafd"

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
