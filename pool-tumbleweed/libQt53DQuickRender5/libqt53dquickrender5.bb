SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package provides Qt 3D QML types for rendering."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DQuickRender5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "084cfb8c785480bd948fb8256921b1c82ebe48c11a3709423a9524976a52f3b7b4aa726881fd8ac96a1cbc23456891605c92cd8e796c4dcb98b5556e5b4cdb6f"

RPROVIDES:${PN} += "libQt53DQuickRender.so.5()(64bit) \
libQt53DQuickRender.so.5(Qt_5)(64bit) \
libQt53DQuickRender5 \
libQt53DQuickRender5(aarch-64) \
libQt53DQuickRenderer5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt53DCore.so.5()(64bit) \
libQt53DCore.so.5(Qt_5)(64bit) \
libQt53DRender.so.5()(64bit) \
libQt53DRender.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core5 \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
