SUMMARY = "Qt 6 CoAP library - Development files"
DESCRIPTION = "Development files for the Qt 6 CoAP library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-coap-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "e15b0a844d06ea16bc71f17fd77d8ac452360e17685e7eb97c9c8ef7a7a39bed9eadf7107e3c02e413316e2a8ca4017eb2409807761d411ce7072955f42beab2"

RPROVIDES:${PN} += "cmake-Qt6Coap \
pkgconfig-Qt6Coap \
qt6-coap-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
libQt6Coap6 \
pkgconfig-Qt6Core"

inherit rpm
