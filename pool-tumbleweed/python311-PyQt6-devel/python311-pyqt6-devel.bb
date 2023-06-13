SUMMARY = "PyQt - devel part of python bindings for Qt 6"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications"
LICENSE = "GPL-3.0-only | SUSE-GPL-2.0-with-FLOSS-exception | NonFree"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-devel-6.5.0-1.2.aarch64.rpm"
RPM_HASH = "83ac79e86f01ca581d64b45525d9ed3515ac8d610a4ac19936b8b0acfe54b0efa413bdd0a6671b26606e1c73e1b7d5f5ea1d5683c42eda6bb4daedd3336ad1df"

RPROVIDES:${PN} += "libpy3.11qt6.so()(64bit) \
python311-PyQt6-devel \
python311-PyQt6-devel(aarch-64) \
python311-qt6-devel"

RDEPENDS:${PN} += "/bin/sh \
cmake(Qt6Bluetooth) \
cmake(Qt6Designer) \
cmake(Qt6Help) \
cmake(Qt6Multimedia) \
cmake(Qt6MultimediaWidgets) \
cmake(Qt6Nfc) \
cmake(Qt6Positioning) \
cmake(Qt6Qml) \
cmake(Qt6Quick) \
cmake(Qt6Quick3D) \
cmake(Qt6Quick3DRuntimeRender) \
cmake(Qt6QuickWidgets) \
cmake(Qt6RemoteObjects) \
cmake(Qt6Sensors) \
cmake(Qt6SerialPort) \
cmake(Qt6Svg) \
cmake(Qt6WebChannel) \
cmake(Qt6WebSockets) \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpython3.11.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
python(abi) \
python311-PyQt6 \
python311-dbus-python-devel \
python311-devel \
qt6-base-devel \
qt6-macros \
update-alternatives"

inherit rpm
