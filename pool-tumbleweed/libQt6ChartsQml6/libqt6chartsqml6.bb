SUMMARY = "Qt 6 ChartsQml library"
DESCRIPTION = "The Qt 6 ChartsQml library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6ChartsQml6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "9920936a9fcfe334b7cf30e808053eba2beb963e2d38e8007446cac58f8d8ed5636231344838ecfe3f198924f5d9c2dce88d12a539cdaf442e51bffe137e5908"

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
