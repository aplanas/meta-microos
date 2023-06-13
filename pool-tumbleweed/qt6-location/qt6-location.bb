SUMMARY = "Qt 6 Location plugins and libraries"
DESCRIPTION = "The Qt Location API helps creating mapping solutions using the data available \
from some of the popular location services."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "abfd80982a52663e4043deeca3a47666e3205c318529e32f997a5335694326d66bd4cbb0c1c4734f205042b043f56843897535622dd72e155beaeb929bcbe402"

RPROVIDES:${PN} += "libdeclarative_locationplugin.so()(64bit) \
libdeclarative_locationplugin.so(Qt_6)(64bit) \
libdeclarative_locationplugin.so(Qt_6.0)(64bit) \
libdeclarative_locationplugin.so(Qt_6.1)(64bit) \
libdeclarative_locationplugin.so(Qt_6.2)(64bit) \
libdeclarative_locationplugin.so(Qt_6.3)(64bit) \
libdeclarative_locationplugin.so(Qt_6.4)(64bit) \
libdeclarative_locationplugin.so(Qt_6.5)(64bit) \
libdeclarative_locationplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqtgeoservices_itemsoverlay.so()(64bit) \
libqtgeoservices_itemsoverlay.so(Qt_6)(64bit) \
libqtgeoservices_itemsoverlay.so(Qt_6.0)(64bit) \
libqtgeoservices_itemsoverlay.so(Qt_6.1)(64bit) \
libqtgeoservices_itemsoverlay.so(Qt_6.2)(64bit) \
libqtgeoservices_itemsoverlay.so(Qt_6.3)(64bit) \
libqtgeoservices_itemsoverlay.so(Qt_6.4)(64bit) \
libqtgeoservices_itemsoverlay.so(Qt_6.5)(64bit) \
libqtgeoservices_itemsoverlay.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqtgeoservices_osm.so()(64bit) \
libqtgeoservices_osm.so(Qt_6)(64bit) \
libqtgeoservices_osm.so(Qt_6.0)(64bit) \
libqtgeoservices_osm.so(Qt_6.1)(64bit) \
libqtgeoservices_osm.so(Qt_6.2)(64bit) \
libqtgeoservices_osm.so(Qt_6.3)(64bit) \
libqtgeoservices_osm.so(Qt_6.4)(64bit) \
libqtgeoservices_osm.so(Qt_6.5)(64bit) \
libqtgeoservices_osm.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-location \
qt6-location(aarch-64) \
qt6qmlimport(QtLocation.2) \
qt6qmlimport(QtLocation.5) \
qt6qmlimport(QtLocation.6)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Location.so.6()(64bit) \
libQt6Location.so.6(Qt_6)(64bit) \
libQt6Location.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6Positioning.so.6()(64bit) \
libQt6Positioning.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
