SUMMARY = "Qt 5 OpenGL Library"
DESCRIPTION = "The Qt OpenGL module provides an OpenGL widget class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5OpenGL5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "1eb7433f309437f6f6b5066ed21b629c3ee6ce42730a51165b18337cfe6d782375482bcaa4273a822e1a2114e8e7780f93a15020ad9bbdd8f17b859901fce5b8"

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
