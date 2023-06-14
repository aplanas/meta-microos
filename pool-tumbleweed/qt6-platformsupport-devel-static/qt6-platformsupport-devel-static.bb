SUMMARY = "Qt PlatformSupport module"
DESCRIPTION = "Qt PlatformSupport module."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-platformsupport-devel-static-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0c1e05619237c1f12c7d782a3f860d35644345774d6b86b5c05bf8959edc4c522569dd87e36a2c34b8e9e1790d7d7586dc13985becf2b6ac24b91f161ed8bc3f"

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
