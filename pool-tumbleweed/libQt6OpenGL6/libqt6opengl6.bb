SUMMARY = "Qt 6 OpenGL library"
DESCRIPTION = "The Qt OpenGL module provides an OpenGL widget class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6OpenGL6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a209b2731eceac90d3683635aed363e5042352963a0f34763ddad321c43e1e46ad58588cb46e870cb67cfca935285578806936d5bd3648b6fb4b0617f6266dee"

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
