SUMMARY = "Qt 5 OpenGL Library"
DESCRIPTION = "The Qt OpenGL module provides an OpenGL widget class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5OpenGL5-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "917d6ebd771af096d39e28b990d5d42a17b7b066c782d77a4698caf8c8a1be81e99320245899ed7c8103f997388aaafe42a3d7a96e4d6687c72298408904875f"

RPROVIDES:${PN} += "libQt5OpenGL.so.5 \
libQt5OpenGL5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
