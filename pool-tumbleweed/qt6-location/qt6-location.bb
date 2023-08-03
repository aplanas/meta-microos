SUMMARY = "Qt 6 Location plugins and libraries"
DESCRIPTION = "The Qt Location API helps creating mapping solutions using the data available \
from some of the popular location services."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-location-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "1adcdd47fc0334f987a2d3311f8195c55e8d445f65e59373c97effe7783f615a08016aa7c1db0e59b9625cdbe37296f43910dd2a8dd43fbeff5e91c7f3ef49e3"

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
