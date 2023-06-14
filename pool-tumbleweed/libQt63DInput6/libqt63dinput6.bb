SUMMARY = "Qt 6 3DInput library"
DESCRIPTION = "The Qt 6 3DInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DInput6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "86d3209dd4f9f79a59757595b9db8ef5f7fe3f611deadd94ec36b1eb1a807c0e13e3f3e7d49a516fc8a49eb9ec6aa58fe7e9fd96b313f71a5cf79a1cbfec6bb7"

RPROVIDES:${PN} += "libQt63DInput.so.6 \
libQt63DInput6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
