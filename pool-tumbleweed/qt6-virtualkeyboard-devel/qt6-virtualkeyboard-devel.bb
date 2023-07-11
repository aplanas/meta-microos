SUMMARY = "Qt 6 VirtualKeyboard library - Development files"
DESCRIPTION = "Development files for the Qt 6 VirtualKeyboard library."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-virtualkeyboard-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "ffb8f5aab1bcca0db5115b7685e54857723fc81e7711aa537fbf79b810218a15618afdb35787d22be8f2ad937c9887ec7fe24cd255cd86aaf5aa2413c2ec06e5"

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
