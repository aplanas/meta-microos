SUMMARY = "PyQt - devel part of python bindings for Qt 6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications"
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-devel-6.5.0-2.2.aarch64.rpm"
RPM_HASH = "c7242ccb00794c107e3974f841215c03ab794ae70d1050fb00e78a32cd921fa33a72c31c3fc2516e717f76cac49771c34900c02305412099f28f61bc3010c1f1"

RPROVIDES:${PN} += "libpy3.9qt6.so \
python39-PyQt6-devel \
python39-qt6-devel"

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
libpython3.9.so.1.0 \
libstdc++.so.6 \
python-abi \
python39-PyQt6 \
python39-dbus-python-devel \
python39-devel \
qt6-base-devel \
qt6-macros \
update-alternatives"

inherit rpm
