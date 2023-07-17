SUMMARY = "Qt 6 OpenGL library"
DESCRIPTION = "The Qt OpenGL module provides an OpenGL widget class that can be used \
like any other Qt widget, except that it opens an OpenGL display \
buffer where the OpenGL API can be used to render the contents."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6OpenGL6-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "07c4ccff1ce224675183838e613a0dec1343ff600515067c6cdb9a7785aa544c14cc07a3fc0234d58f6e3908e752a3faa321227baba26a7652e5f4421b424ae0"

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
