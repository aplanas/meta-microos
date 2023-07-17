SUMMARY = "Qt 6 VirtualKeyboard library - Development files"
DESCRIPTION = "Development files for the Qt 6 VirtualKeyboard library."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "99fa6bbb8f760be59f825a92519cacf388087823f609568581bb35456af6b392566bf9aa8e5c1c2931377a8a29ed91dd6a9d01787425eae594e3d6320bffe616"

RPROVIDES:${PN} += "cmake-Qt6VirtualKeyboard \
pkgconfig-Qt6HunspellInputMethod \
pkgconfig-Qt6VirtualKeyboard \
qt6-virtualkeyboard-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Gui \
cmake-Qt6Qml \
cmake-Qt6Quick \
libQt6VirtualKeyboard6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6VirtualKeyboard"

inherit rpm
