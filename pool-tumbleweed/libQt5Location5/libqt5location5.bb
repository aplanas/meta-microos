SUMMARY = "Qt 5 Location Library"
DESCRIPTION = "The Qt Location API facilitates creating mapping solutions using \
the data available from some contemporary location services. \
Using Qt Location, one can \
 \
 * access and present map data, \
 * support touch gesture on a specific area of the map, \
 * query for a specific geographical location and route, \
 * add additional layers on top, such as polylines and circles, \
 * and search for places and related images."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libQt5Location5-5.15.9+kde5-1.2.aarch64.rpm"
RPM_HASH = "7bab5a70dbfdc638155e1db4e1ecca9aa98f22ca8024ec80fe70cdd165dc5e3bca1c1e020f1ea13444d08d1c85691c7654df442afb99c2063cb0662bf10924d5"

RPROVIDES:${PN} += "libQt5Location.so.5()(64bit) \
libQt5Location.so.5(Qt_5)(64bit) \
libQt5Location.so.5(Qt_5.0)(64bit) \
libQt5Location.so.5(Qt_5.1)(64bit) \
libQt5Location.so.5(Qt_5.10)(64bit) \
libQt5Location.so.5(Qt_5.11)(64bit) \
libQt5Location.so.5(Qt_5.12)(64bit) \
libQt5Location.so.5(Qt_5.13)(64bit) \
libQt5Location.so.5(Qt_5.14)(64bit) \
libQt5Location.so.5(Qt_5.15)(64bit) \
libQt5Location.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Location.so.5(Qt_5.2)(64bit) \
libQt5Location.so.5(Qt_5.3)(64bit) \
libQt5Location.so.5(Qt_5.4)(64bit) \
libQt5Location.so.5(Qt_5.5)(64bit) \
libQt5Location.so.5(Qt_5.6)(64bit) \
libQt5Location.so.5(Qt_5.7)(64bit) \
libQt5Location.so.5(Qt_5.8)(64bit) \
libQt5Location.so.5(Qt_5.9)(64bit) \
libQt5Location5 \
libQt5Location5(aarch-64) \
libdeclarative_location.so()(64bit) \
liblocationlabsplugin.so()(64bit) \
libqtgeoservices_esri.so()(64bit) \
libqtgeoservices_itemsoverlay.so()(64bit) \
libqtgeoservices_mapbox.so()(64bit) \
libqtgeoservices_mapboxgl.so()(64bit) \
libqtgeoservices_nokia.so()(64bit) \
libqtgeoservices_osm.so()(64bit) \
qt5qmlimport(Qt.labs.location.1) \
qt5qmlimport(QtLocation.5)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5()(64bit) \
libQt5Positioning.so.5(Qt_5)(64bit) \
libQt5Positioning.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5PositioningQuick.so.5()(64bit) \
libQt5PositioningQuick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Qml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5QmlModels.so.5()(64bit) \
libQt5QmlModels.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.30)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libz.so.1()(64bit)"

inherit rpm
