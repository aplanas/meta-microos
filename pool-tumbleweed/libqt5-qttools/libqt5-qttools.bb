SUMMARY = "Qt 5 QtTools Module"
DESCRIPTION = "The QtTools modules contains some tools mostly useful for application development. \
 \
Included are QtAssistant (help browser), QtDesigner (GUI design), QDbusViewer \
and several more."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qttools-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "15903b9874613f84bb038cb7ac5a14c2f12a41e97f68a56675b072e22ac29ed1d0ffe94b68e41e5286ec78cd549e673a91a47c41b0e3bcaddd2bde007efbcc54"

RPROVIDES:${PN} += "cmake-Qt5AttributionsScannerTools \
libqquickwidget.so \
libqt5-qttools"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libQt5Designer.so.5 \
libQt5DesignerComponents.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libqt5-qdbus \
libqt5-qtpaths \
libqt5-qttools-qhelpgenerator \
libstdc++.so.6"

inherit rpm
