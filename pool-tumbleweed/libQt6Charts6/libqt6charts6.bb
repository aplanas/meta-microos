SUMMARY = "Qt 6 Charts library"
DESCRIPTION = "The Qt 6 Charts library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6Charts6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "783ce8235ba556ebf2f4c5cd065a90ac1a19bfbe33c26685ac62e220178b1313ccf2434a88465b23dc1eed677163a3d549c54a46d39e9ff885c519e220752f8f"

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
