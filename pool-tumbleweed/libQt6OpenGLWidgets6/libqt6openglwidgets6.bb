SUMMARY = "Qt 6 OpenGLWidgets library"
DESCRIPTION = "The Qt OpenGL Widgets module provides an OpenGLWidgets class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6OpenGLWidgets6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "3060d1c839766c2ebf1857e9be2af7be70345256ce779d404aceae6b42fd28bfae113a08d20504532be0cae281d476a4e95f1bbfe01edd7a118dc31bc192beb4"

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
