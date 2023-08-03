SUMMARY = "Qt 6 VirtualKeyboard library - Development files"
DESCRIPTION = "Development files for the Qt 6 VirtualKeyboard library."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-virtualkeyboard-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "21ff91a8df96596de6d4085e0539c6531ba65f4f72fa65d40d8170846113d9125d1faaa6e97f4d7da9070d40bdc006b8a20702e7d6b6227254b681489d378bad"

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
