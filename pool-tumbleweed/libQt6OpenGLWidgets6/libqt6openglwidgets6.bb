SUMMARY = "Qt 6 OpenGLWidgets library"
DESCRIPTION = "The Qt OpenGL Widgets module provides an OpenGLWidgets class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6OpenGLWidgets6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "2ba0bd4189318ba7f6e10beb5892ff1a90e6b173fc24f7849820d04025c357a3a83f385052a6b26826c3a3885eec8be46aca2457d1c59bd80a482b8684222777"

RPROVIDES:${PN} += "libQt6OpenGLWidgets.so.6 \
libQt6OpenGLWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Widgets.so.6 \
libQt6Widgets6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
