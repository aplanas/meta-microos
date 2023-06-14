SUMMARY = "Qt 6 OpenGL library"
DESCRIPTION = "The Qt OpenGL module provides an OpenGL widget class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6OpenGL6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "45115c2ac3442f6b7c5865cb85ff95f233dbf3ae1008e02fb4510c4df3b854c5e32deb0703b9bf4b357238779637b5a8e2d64a6e19e57475c562a72acf9ba3ca"

RPROVIDES:${PN} += "libQt6OpenGL.so.6 \
libQt6OpenGL6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGLESv2.so.2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
