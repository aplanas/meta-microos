SUMMARY = "QML imports for the XmlPatterns module"
DESCRIPTION = "This package provides the QtQuick.XmlListModel QML import."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtxmlpatterns-imports-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "04559ba7c4a8eba66f678cec07cf26427a3b90eaf9404fcfcc3a3a306d91950af81e4d7bae72543dc0f2167cc29cf973c54978781b28ba15cb3597128a47cd1f"

RPROVIDES:${PN} += "libqmlxmllistmodelplugin.so \
libqt5-qtxmlpatterns-imports \
qt5qmlimport-QtQuick.XmlListModel.2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5XmlPatterns.so.5 \
libQt5XmlPatterns5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
