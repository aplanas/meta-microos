SUMMARY = "Qt 6 ChartsQml library"
DESCRIPTION = "The Qt 6 ChartsQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "libQt6ChartsQml6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "9ac7954f27ef21dc4a6b1386cd4698dc3f6b6a71dc5efc10dc2605a7de6fec48321bff634ffb67befb382ee41e005892ca9fbecdcff446ef56bf4f1df4ed8a26"

RPROVIDES:${PN} += "libQt6ChartsQml.so.6 \
libQt6ChartsQml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
