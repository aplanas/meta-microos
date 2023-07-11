SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package provides core Qt 3D QML types."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DQuick5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "a232c26b103ca6886e46979305c7d8bd0e734930d749478f2bcd82d4b85b6af924e592d562dfdff3783d889a3fffffcfe2d1c4ede76774280f7a42a632cef1e1"

RPROVIDES:${PN} += "libQt53DQuick.so.5 \
libQt53DQuick5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libQt5QmlModels.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
