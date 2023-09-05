SUMMARY = "Generic map viewer"
DESCRIPTION = "Marble is a viewer of map data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "marble-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "b08da383486a8469e747e43f5fd347238a8af6615765a74b8eef2d77fd886c06360c54edb3a97613a45633e56d1d1526143514e73a57f0a62809474b28879ce8"

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
libprotobuf.so.23.4.0 \
libshp.so.2 \
libstdc++.so.6 \
libz.so.1 \
marble-data \
marble-frontend"

inherit rpm
