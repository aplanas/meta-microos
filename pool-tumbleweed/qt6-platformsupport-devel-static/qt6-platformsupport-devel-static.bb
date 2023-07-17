SUMMARY = "Qt PlatformSupport module"
DESCRIPTION = "Qt PlatformSupport module."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-platformsupport-devel-static-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "745c07c3a8dcb95276a3aa7c54942631a32ee768e552de65a4152802682e6704b1fa37128052823fcf606f96046b74c32702323661eab9365c015f41630c98b4"

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
