SUMMARY = "Qt PlatformSupport module"
DESCRIPTION = "Qt PlatformSupport module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5PlatformSupport-devel-static-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "06a4c35d3428eeb5ad52914e4925ddac753d577b4938f77f77f332c9db7250fda3aff1a87b1546a83efa1e76a83200e991f0923d8f8d62f9ce4fd8a78ec8bcea"

RPROVIDES:${PN} += "cmake-Qt5AccessibilitySupport \
cmake-Qt5DeviceDiscoverySupport \
cmake-Qt5EdidSupport \
cmake-Qt5EglSupport \
cmake-Qt5EventDispatcherSupport \
cmake-Qt5FbSupport \
cmake-Qt5FontDatabaseSupport \
cmake-Qt5InputSupport \
cmake-Qt5LinuxAccessibilitySupport \
cmake-Qt5PlatformCompositorSupport \
cmake-Qt5ServiceSupport \
cmake-Qt5ThemeSupport \
cmake-Qt5VulkanSupport \
cmake-Qt5XkbCommonSupport \
libQt5PlatformSupport-devel-static"

RDEPENDS:${PN} += "libQt5Core-devel \
libQt5Gui-devel \
libQt5PlatformHeaders-devel \
pkgconfig-Qt5DBus \
pkgconfig-egl \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-gl \
pkgconfig-glib-2.0 \
pkgconfig-libinput \
pkgconfig-libudev \
pkgconfig-mtdev \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xkbcommon \
pkgconfig-xkbcommon-x11 \
pkgconfig-xrender \
tslib-devel"

inherit rpm
