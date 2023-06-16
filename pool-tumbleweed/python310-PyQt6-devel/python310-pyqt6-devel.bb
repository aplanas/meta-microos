SUMMARY = "PyQt - devel part of python bindings for Qt 6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications"
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "9cd78463f9e481e112d5921735a9dcb37c6dea1af8e80cc03bc7d4dd47098a9aa7f9696565c784fcf81fd6e8d2010ac393c634459f62512f6a545be4cb4d93cb"

RPROVIDES:${PN} += "libpy3.10qt6.so \
python3-PyQt6-devel \
python3-qt6-devel \
python310-PyQt6-devel \
python310-qt6-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
cmake-Qt6Bluetooth \
cmake-Qt6Designer \
cmake-Qt6Help \
cmake-Qt6Multimedia \
cmake-Qt6MultimediaWidgets \
cmake-Qt6Nfc \
cmake-Qt6Positioning \
cmake-Qt6Qml \
cmake-Qt6Quick \
cmake-Qt6Quick3D \
cmake-Qt6Quick3DRuntimeRender \
cmake-Qt6QuickWidgets \
cmake-Qt6RemoteObjects \
cmake-Qt6Sensors \
cmake-Qt6SerialPort \
cmake-Qt6Svg \
cmake-Qt6WebChannel \
cmake-Qt6WebSockets \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi \
python310-PyQt6 \
python310-dbus-python-devel \
python310-devel \
qt6-base-devel \
qt6-macros \
update-alternatives"

inherit rpm
