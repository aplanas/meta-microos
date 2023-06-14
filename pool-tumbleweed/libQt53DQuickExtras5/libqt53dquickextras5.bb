SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DQuickExtras5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "69bf9c094b041b1ec5efd8c136d3a80d6401b0a089941e6d363cdf696e30663e52370c9211d2066794021ed3be8084c8d6e642d7d73c98e74df832476fd693a8"

RPROVIDES:${PN} += "libQt53DQuickExtras.so.5 \
libQt53DQuickExtras5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt53DExtras.so.5 \
libQt53DInput.so.5 \
libQt53DLogic.so.5 \
libQt53DQuick.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
