SUMMARY = "Qt 6 Mqtt library - Development files"
DESCRIPTION = "Development files for the Qt 6 Mqtt library."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-mqtt-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a4fda9c2e9cde5e2ba647452d1271d42de5713033b4a7e25084392fe32f1aa49f3fd66c1e7d788f725e566b08e325eddf746f76c47443c10743130f35b63eb8e"

RPROVIDES:${PN} += "cmake-Qt6Mqtt \
pkgconfig-Qt6Mqtt \
qt6-mqtt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
libQt6Mqtt6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network"

inherit rpm
