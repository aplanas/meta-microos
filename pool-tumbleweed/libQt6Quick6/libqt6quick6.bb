SUMMARY = "Qt 6 Quick library"
DESCRIPTION = "The Qt 6 Quick library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6Quick6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f58603c78b380263f20cc34185d0273797f0fccc1d98d05b3cbc1b55978e67a96a07b581026fc189b470142584c4f26cd71d0a7160d7ed7ff28d8fb7f4e88b82"

RPROVIDES:${PN} += "libQt6Quick.so.6 \
libQt6Quick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
