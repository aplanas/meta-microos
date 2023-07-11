SUMMARY = "Development files for KSaneCore, a Qt library for scanner hardware"
DESCRIPTION = "KSaneCore is a Qt-based interface for SANE library to control scanner hardware. \
This package contains the development files required to use KSaneCore in other \
applications."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "ksanecore-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "d936b3c3d9c0f257a15adbc6cd1ae1aa9f1f99c743de81f8515d078701ed75bf0a01fb8ddd4ddfdc9363dc80682ea54f5f671ec364dcf423514bcf152c2c40c7"

RPROVIDES:${PN} += "cmake-KSaneCore \
ksanecore-devel"

RDEPENDS:${PN} += "cmake-KF5Wallet \
cmake-KF5WidgetsAddons \
cmake-Qt5Gui \
libKSaneCore1 \
pkgconfig \
sane-backends-devel"

inherit rpm
