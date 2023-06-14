SUMMARY = "Qt 6 Charts library"
DESCRIPTION = "The Qt 6 Charts library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Charts6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "cd6be5c7108f455b8b86b0ca73fe4c251097f34d40e0dcf7c027f3d8f37f5a783260d4b7aa0888140eeabb1c829b5f21610e58ea906027787a7a3b02a86f9961"

RPROVIDES:${PN} += "libQt6Charts.so.6 \
libQt6Charts6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
