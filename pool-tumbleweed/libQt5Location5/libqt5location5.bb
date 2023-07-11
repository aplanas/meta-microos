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

PV = "5.15.10+kde4"

RPM_NAME = "libQt5Location5-5.15.10+kde4-1.1.aarch64.rpm"
RPM_HASH = "4eb0b76eb234c4322ea7424a027a72a0c8f01542c763e6c81925f0a772d3c783938a2a9b5d544f42e06dbe2b7beecccbedafb80b9ada7c1e55e1f8b3fe07f100"

RPROVIDES:${PN} += "libQt5Location.so.5 \
libQt5Location5 \
libdeclarative-location.so \
liblocationlabsplugin.so \
libqtgeoservices-esri.so \
libqtgeoservices-itemsoverlay.so \
libqtgeoservices-mapbox.so \
libqtgeoservices-mapboxgl.so \
libqtgeoservices-nokia.so \
libqtgeoservices-osm.so \
qt5qmlimport-Qt.labs.location.1 \
qt5qmlimport-QtLocation.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Positioning.so.5 \
libQt5PositioningQuick.so.5 \
libQt5Qml.so.5 \
libQt5QmlModels.so.5 \
libQt5Quick.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.73 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
