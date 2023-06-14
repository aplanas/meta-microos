SUMMARY = "Qt 6 Location plugins and libraries"
DESCRIPTION = "The Qt Location API helps creating mapping solutions using the data available \
from some of the popular location services."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-location-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "abfd80982a52663e4043deeca3a47666e3205c318529e32f997a5335694326d66bd4cbb0c1c4734f205042b043f56843897535622dd72e155beaeb929bcbe402"

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
