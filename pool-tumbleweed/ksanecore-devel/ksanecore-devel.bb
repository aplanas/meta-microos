SUMMARY = "Development files for KSaneCore, a Qt library for scanner hardware"
DESCRIPTION = "KSaneCore is a Qt-based interface for SANE library to control scanner hardware. \
This package contains the development files required to use KSaneCore in other \
applications."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "ksanecore-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "166e336c9b467dc4299624b9d097d17cfac27e33903a1786db344a9705c4481f906c8f3ee4b6ab24802abd6854d5b48c06d2fe41a6a7f23c00096dd9c7178b94"

RPROVIDES:${PN} += "cmake-KSaneCore \
ksanecore-devel"

RDEPENDS:${PN} += "cmake-KF5Wallet \
cmake-KF5WidgetsAddons \
cmake-Qt5Gui \
libKSaneCore1 \
pkgconfig \
sane-backends-devel"

inherit rpm
