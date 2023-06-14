SUMMARY = "Qt 6 ChartsQml library"
DESCRIPTION = "The Qt 6 ChartsQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6ChartsQml6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dfc8d96847c8fbc1601781624d5fe895bb1ec7333a9781f1cca21f3c89fb763a41de8ea523fc7c7a8013c49c3f97c9ab1862de3b4ab4e90ece4fdc20523c7490"

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
