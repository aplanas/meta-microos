SUMMARY = "Qt PlatformSupport module"
DESCRIPTION = "Qt PlatformSupport module."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-platformsupport-devel-static-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "434cda0f615000e27a2d4fd2c1a4b7f95d688d71fe3d821be812399529f029bcbb6ae0ca6f71cd1e83b1bb27a59b1becdc18446ed5769772fbdacb0d866523bd"

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
