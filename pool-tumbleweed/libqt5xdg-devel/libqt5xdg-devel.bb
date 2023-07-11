SUMMARY = "Devel files for libqtxdg"
DESCRIPTION = "QtXDG libraries for development"
LICENSE = "GPL-3.0-only"

PV = "3.11.0"

RPM_NAME = "libqt5xdg-devel-3.11.0-1.3.aarch64.rpm"
RPM_HASH = "f5a37b0acd58317002f15dd57cc8547bc39117c5fa2c99dd1e9f8a79c87760b3b465b28a223c8da7177f3e10671850e05470a0f2d27892712e98b8dd013a716e"

RPROVIDES:${PN} += "cmake-qt5xdg \
libqt5xdg-devel \
pkgconfig-Qt5Xdg"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Xdg3 \
pkgconfig \
pkgconfig-Qt5Core \
pkgconfig-Qt5DBus \
pkgconfig-Qt5UiTools \
pkgconfig-Qt5Widgets \
pkgconfig-Qt5XdgIconLoader \
pkgconfig-Qt5Xml"

inherit rpm
