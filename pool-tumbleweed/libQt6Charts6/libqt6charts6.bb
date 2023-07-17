SUMMARY = "Qt 6 Charts library"
DESCRIPTION = "The Qt 6 Charts library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Charts6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "33788dfe4c1ff591411f368fbf1ebe155ec1f3ba78ff2971d50f6e5f47bdb302e0f7b00ed4e9dfd55e3b1419a40775c4014b82b5d8c0a5950e2dde4b0e0d9cd2"

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
