SUMMARY = "Qt 5 OpenGL Library"
DESCRIPTION = "The Qt OpenGL module provides an OpenGL widget class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5OpenGL5-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "49a41776a29437d43624f037c1e7b1db5ae76001b5c5257a16bcc81e740c708ebd9117c0f7328b7d0930aad80366f8b2d75715b6733b6be0b27c0a6347732f44"

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
