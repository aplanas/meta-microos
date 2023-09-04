SUMMARY = "Qt PlatformSupport module"
DESCRIPTION = "Qt PlatformSupport module."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-platformsupport-devel-static-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "7e147e06add3fd9ee7f0a5230aec99c36c6c813ae62f008959373fd018311dce9d8848325c5e38a5b4399794f1fbdeed6b988eb4d46fd0c3b2aad772e899675c"

RPROVIDES:${PN} += "cmake-Qt6DeviceDiscoverySupportPrivate \
cmake-Qt6FbSupportPrivate \
cmake-Qt6InputSupportPrivate \
qt6-platformsupport-devel-static"

RDEPENDS:${PN} += "pkgconfig-atspi-2 \
pkgconfig-egl \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-gl \
pkgconfig-glib-2.0 \
pkgconfig-libinput \
pkgconfig-libudev \
pkgconfig-mtdev \
pkgconfig-tslib \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xkbcommon \
pkgconfig-xkbcommon-x11 \
pkgconfig-xrender \
qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
