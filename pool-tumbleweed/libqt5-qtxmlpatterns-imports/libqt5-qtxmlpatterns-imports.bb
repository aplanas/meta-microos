SUMMARY = "QML imports for the XmlPatterns module"
DESCRIPTION = "This package provides the QtQuick.XmlListModel QML import."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtxmlpatterns-imports-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "13f074b466151699b93c93a0a31596671a1d20e30a84a46da26417fa144fb1ab4ad0e204d4b7b52cab1f838f30187bc2b1c7956c7aee790eba2ddfc60b09db88"

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
