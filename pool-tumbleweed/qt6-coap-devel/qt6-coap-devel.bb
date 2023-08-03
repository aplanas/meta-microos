SUMMARY = "Qt 6 CoAP library - Development files"
DESCRIPTION = "Development files for the Qt 6 CoAP library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-coap-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "111d1ba5111eaa6740f004c0f03a9ade1d2db88364c6eb2702f552e24a1863d3e78dfedf30dae6c2c1d0d2aa8cebdeea57257415edf748f279621d9060118fa3"

RPROVIDES:${PN} += "cmake-Qt6Coap \
pkgconfig-Qt6Coap \
qt6-coap-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
libQt6Coap6 \
pkgconfig-Qt6Core"

inherit rpm
