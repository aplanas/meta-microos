SUMMARY = "Qt 6 QuickTemplates2 library"
DESCRIPTION = "The Qt 6 QuickTemplates2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickTemplates2-6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "f033751de1d6a2ce7109e543dad0bb6c64dbcf9acf4ec713e0628098af89573693d5bfa03c2b8ab094e3cea7152e655fba86c59ea43e33cef2cb0954cc58f590"

RPROVIDES:${PN} += "libQt6QuickTemplates2-6 \
libQt6QuickTemplates2.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
