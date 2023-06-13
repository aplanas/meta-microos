SUMMARY = "Generic map viewer"
DESCRIPTION = "Marble is a viewer of map data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "marble-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "389ee16be0fe0d5deb357a292088fce8ed402164d641bbc87a7c98b34eb2680760649185bc478025c177cb109c91459b8297359b26af529a9a9dd30ddd89f7b4"

RPROVIDES:${PN} += "application() \
application(marble_geo.desktop) \
application(marble_geojson.desktop) \
application(marble_gpx.desktop) \
application(marble_kml.desktop) \
application(marble_kmz.desktop) \
application(marble_shp.desktop) \
application(marble_worldwind.desktop) \
libmarble_part.so()(64bit) \
libmarbledeclarative.so()(64bit) \
libmarblequick.so()(64bit) \
marble \
marble(aarch-64) \
marble5 \
metainfo() \
metainfo(org.kde.marble.appdata.xml) \
metainfo(org.kde.plasma.worldclock.appdata.xml) \
metainfo(org.kde.plasma.worldmap.appdata.xml) \
mimehandler(application/geo+json) \
mimehandler(application/gpx+xml) \
mimehandler(application/vnd.google-earth.kml+xml) \
mimehandler(application/vnd.google-earth.kmz) \
mimehandler(application/x-esri-shape) \
mimehandler(x-scheme-handler/geo) \
mimehandler(x-scheme-handler/worldwind) \
qt5qmlimport(org.kde.marble.private.plasma.0) \
qt5qmlimport(org.kde.marble.private.plasma.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Runner.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5()(64bit) \
libQt5Positioning.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5SerialPort.so.5()(64bit) \
libQt5SerialPort.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libastro.so.1()(64bit) \
libastro1 \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgps.so.30()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmarblewidget-qt5-28 \
libmarblewidget-qt5.so.28()(64bit) \
libphonon4qt5.so.4()(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libshp.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libz.so.1()(64bit) \
marble-data \
marble-frontend"

inherit rpm
