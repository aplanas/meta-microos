SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This Qt 3D module contains functionality to support near-realtime \
simulation systems."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde0"

RPM_NAME = "libQt53DQuickAnimation5-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "8a8f5cb8f96defdf7771476e60a2c23e490825076af083c4eb70a5ab64bc929c9e3286d3effa32ede6ea937c44b76f3bf5dedab7f3e9cd99891e784e70aaecff"

RPROVIDES:${PN} += "libQt53DQuickAnimation.so.5 \
libQt53DQuickAnimation5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DAnimation.so.5 \
libQt53DCore.so.5 \
libQt53DRender.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Qml.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
