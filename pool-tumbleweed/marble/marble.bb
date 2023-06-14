SUMMARY = "Generic map viewer"
DESCRIPTION = "Marble is a viewer of map data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "marble-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "389ee16be0fe0d5deb357a292088fce8ed402164d641bbc87a7c98b34eb2680760649185bc478025c177cb109c91459b8297359b26af529a9a9dd30ddd89f7b4"

RPROVIDES:${PN} += "libmarble-part.so \
libmarbledeclarative.so \
libmarblequick.so \
marble \
marble5 \
qt5qmlimport-org.kde.marble.private.plasma.0 \
qt5qmlimport-org.kde.marble.private.plasma.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5Runner.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Positioning.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5SerialPort.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libastro.so.1 \
libastro1 \
libc.so.6 \
libgcc-s.so.1 \
libgps.so.30 \
libm.so.6 \
libmarblewidget-qt5-28 \
libmarblewidget-qt5.so.28 \
libphonon4qt5.so.4 \
libprotobuf-3.21.12.so \
libshp.so.2 \
libstdc++.so.6 \
libz.so.1 \
marble-data \
marble-frontend"

inherit rpm
