SUMMARY = "Qt 6 CoAP library - Development files"
DESCRIPTION = "Development files for the Qt 6 CoAP library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-coap-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "bbad74c8ddac4d2ec04031bd057bdf3cc16612beb13f7136d391942cfe5326f0eb40b7a0423861d065ea9ffefdf54a682e273efbd51f5c7cac4861b4db0998dd"

RPROVIDES:${PN} += "cmake-Qt6Coap \
pkgconfig-Qt6Coap \
qt6-coap-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
libQt6Coap6 \
pkgconfig-Qt6Core"

inherit rpm
