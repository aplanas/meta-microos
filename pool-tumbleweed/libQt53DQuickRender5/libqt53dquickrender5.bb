SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package provides Qt 3D QML types for rendering."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DQuickRender5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "97d9137e87fcf8d64b0f37a5bcde8c15bc1c7dbeca87c62fb0a5321e9e577c1788f1cb579344725e8fc009f40f3a597319a61f6f02be0f61e5ea0a4997e1f93a"

RPROVIDES:${PN} += "libQt53DQuickRender.so.5 \
libQt53DQuickRender5 \
libQt53DQuickRenderer5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
