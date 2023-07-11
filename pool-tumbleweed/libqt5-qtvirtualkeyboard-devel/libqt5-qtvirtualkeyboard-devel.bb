SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs or plugins with \
Qt Virtual Keyboard."
LICENSE = "GPL-3.0"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtvirtualkeyboard-devel-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "f4ed6ab72bfa1cf6ced315297b3a71711517c9a6c0304576163020dfcaab94d1758c89ad23b1b2525abf77f4ecae20c7f75738d95d8e32f78b4d6a9920240745"

RPROVIDES:${PN} += "cmake-Qt5VirtualKeyboard \
libqt5-qtvirtualkeyboard-devel \
pkgconfig-Qt5VirtualKeyboard"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libqt5-qtvirtualkeyboard \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml \
pkgconfig-Qt5Quick"

inherit rpm
