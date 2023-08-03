SUMMARY = "Qt 6 Mqtt library - Development files"
DESCRIPTION = "Development files for the Qt 6 Mqtt library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-mqtt-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "2c7d204146e74ef073e92d120b8b0da761bdb6b571c0320d4ea5ba11637b45238a7ddaca78c0d1cc69852b502466f0783002eafdb925a7efbcf57d8b42be5b77"

RPROVIDES:${PN} += "cmake-Qt6Mqtt \
pkgconfig-Qt6Mqtt \
qt6-mqtt-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
libQt6Mqtt6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network"

inherit rpm
