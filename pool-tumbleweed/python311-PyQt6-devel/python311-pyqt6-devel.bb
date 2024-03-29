SUMMARY = "PyQt - devel part of python bindings for Qt 6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications"
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.1"

RPM_NAME = "python311-PyQt6-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "c8416e0d6577105ec91f34678c011a2a4a618956197ccdaa0808564f3add1a953b9e292123019caa5830fc5d7917b3d7d7918a3389ec4af60bf65946d8ab71a6"

RPROVIDES:${PN} += "libpy3.11qt6.so \
python3-PyQt6-devel \
python3-qt6-devel \
python311-PyQt6-devel \
python311-qt6-devel"

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
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi \
python311-PyQt6 \
python311-dbus-python-devel \
python311-devel \
qt6-base-devel \
qt6-macros \
update-alternatives"

inherit rpm
