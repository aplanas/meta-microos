SUMMARY = "Qt 6 Quick3D library"
DESCRIPTION = "The Qt 6 Quick3D library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6Quick3D6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "be625555ce1311bf908cb11d16085e03effc95e5f665de3b2efeaa00d9b0c7b76ff4b277d96d15b6fbf70cc3cfcebf5e6d2fd7a53c87ef2077cbf9d831ee8acc"

RPROVIDES:${PN} += "libQt6Quick3D.so.6 \
libQt6Quick3D6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libQt6Quick.so.6 \
libQt6Quick3DRuntimeRender.so.6 \
libQt6Quick3DUtils.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
