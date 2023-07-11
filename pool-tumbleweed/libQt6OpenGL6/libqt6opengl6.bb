SUMMARY = "Qt 6 OpenGL library"
DESCRIPTION = "The Qt OpenGL module provides an OpenGL widget class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6OpenGL6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "a0a26b61f3ed1905e3e28c1a7a2a4f0d2810d2e4e0faaba79229b610a154c465647ec683439ee5bbaa0962a33cd497551c4264efa3740eb2b2a240fd1f3e4c69"

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
