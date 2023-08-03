SUMMARY = "PyQt - devel part of python bindings for Qt 6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications"
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.1"

RPM_NAME = "python39-PyQt6-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "9ce43cb05b7a21079c94142ef57118f11bb9958c0eb75ddbc778f848791ecd403a31f66f4afce0c6fc7d8a151e0a1ebe21880fb70c1881cf07eac2cb39b91c9d"

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
