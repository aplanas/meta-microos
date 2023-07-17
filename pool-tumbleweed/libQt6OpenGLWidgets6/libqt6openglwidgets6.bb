SUMMARY = "Qt 6 OpenGLWidgets library"
DESCRIPTION = "The Qt OpenGL Widgets module provides an OpenGLWidgets class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6OpenGLWidgets6-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "66caeeea73b7e5f2dbd8df874cdb7973d8896cb06017cd08e79a9aefeb4c4aa15a81ccf3bdb2be1b2e61e45a6701a088c39122b8e6515d2098dcd48a28b90b90"

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
