SUMMARY = "Qt PlatformSupport module"
DESCRIPTION = "Qt PlatformSupport module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5PlatformSupport-devel-static-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "bb543f525d09627af4f8f3782a741b67e2f5d18573f16608e310c9e706f73cdbf3b9541f4330b4e5b5d15e2fc3fb45e1a3d2950eb7e8fb88d9e29ed84c4c3381"

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
