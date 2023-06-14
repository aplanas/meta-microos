SUMMARY = "PyQt - devel part of python bindings for Qt 5"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python311-qt5-devel-5.15.9-1.6.aarch64.rpm"
RPM_HASH = "86e6905a59fa6f64bf9ac4dbb232e12a7ed44952dddc0ff515cb393c55626391cd3ad52d62640d5da73fa6c6299c8af41129d50d17b55541cab1d263ee28bcb3"

RPROVIDES:${PN} += "libpy3.11qt5.so \
python-qt5-common-devel \
python-qt5-utils \
python311-PyQt5-devel \
python311-qt5-devel"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libqt5-qtbase-devel \
libstdc++.so.6 \
pkgconfig-Qt5Bluetooth \
pkgconfig-Qt5Designer \
pkgconfig-Qt5Help \
pkgconfig-Qt5Location \
pkgconfig-Qt5Multimedia \
pkgconfig-Qt5MultimediaWidgets \
pkgconfig-Qt5Nfc \
pkgconfig-Qt5Positioning \
pkgconfig-Qt5Qml \
pkgconfig-Qt5Quick \
pkgconfig-Qt5QuickWidgets \
pkgconfig-Qt5SerialPort \
pkgconfig-Qt5Svg \
pkgconfig-Qt5TextToSpeech \
pkgconfig-Qt5UiTools \
pkgconfig-Qt5WebChannel \
pkgconfig-Qt5WebSockets \
pkgconfig-Qt5X11Extras \
pkgconfig-Qt5XmlPatterns \
python-abi \
python311-dbus-python-devel \
python311-devel \
python311-qt5 \
update-alternatives"

inherit rpm
