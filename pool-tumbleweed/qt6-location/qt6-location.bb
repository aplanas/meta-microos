SUMMARY = "Qt 6 Location plugins and libraries"
DESCRIPTION = "The Qt Location API helps creating mapping solutions using the data available \
from some of the popular location services."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "ea5fdb0dd1a23bfbeff80e6dd969f278d8fe13565dcdbf0054fbe5378d6b5f25a65bd9d59448df6248e36f9f5cd96d3fcdea99cbd6d4507c83ec0df9b8806e77"

RPROVIDES:${PN} += "libdeclarative-locationplugin.so \
libqtgeoservices-itemsoverlay.so \
libqtgeoservices-osm.so \
qt6-location \
qt6qmlimport-QtLocation.2 \
qt6qmlimport-QtLocation.5 \
qt6qmlimport-QtLocation.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Location.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
