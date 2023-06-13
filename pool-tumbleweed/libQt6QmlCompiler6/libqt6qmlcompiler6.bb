SUMMARY = "Qt6 QmlCompiler library"
DESCRIPTION = "The Qt 6 QmlCompiler library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlCompiler6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "34195f9659daf39a11202641ff380070b3719891aeb82ec735f172213c3fc88b6223a2e276a4fdf85a4e466bb819a0d68777aa72a938af810e1e503ec1da986b"

RPROVIDES:${PN} += "libQt6QmlCompiler.so.6()(64bit) \
libQt6QmlCompiler.so.6(Qt_6)(64bit) \
libQt6QmlCompiler6 \
libQt6QmlCompiler6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
