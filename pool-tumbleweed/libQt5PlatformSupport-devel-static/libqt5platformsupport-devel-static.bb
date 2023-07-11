SUMMARY = "Qt PlatformSupport module"
DESCRIPTION = "Qt PlatformSupport module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5PlatformSupport-devel-static-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "715a8737a49f322b28908c74a9bb03bef091f13ab78d1d5a4ff3d8cfafe27b090de9d4cd867a38de5d25025998fe852695e096a09e2d6bc4615d5f0b87f1ea69"

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
