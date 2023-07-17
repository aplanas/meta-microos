SUMMARY = "Qt6 QmlCompiler library"
DESCRIPTION = "The Qt 6 QmlCompiler library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlCompiler6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "007218e4edfde364facc30565f7af9d971384298fdec6656caef28b4f7b2159c236a876cabe450a750ef6c22e6c2adb3348530544dc5cb0534adbee819dd3d7d"

RPROVIDES:${PN} += "libQt6QmlCompiler.so.6 \
libQt6QmlCompiler6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
