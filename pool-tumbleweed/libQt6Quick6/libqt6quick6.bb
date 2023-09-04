SUMMARY = "Qt 6 Quick library"
DESCRIPTION = "The Qt 6 Quick library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6Quick6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "050046673381c2e1d7d36ad15b2df2c1d1b98f80a2ccb904cd24e674f37a2bd9bd30d09a80fcbb574409da7c8041b7efbf318557165397cd20f991da7040878f"

RPROVIDES:${PN} += "libQt6Quick.so.6 \
libQt6Quick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
