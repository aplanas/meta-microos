SUMMARY = "Qt 6 3DQuickInput library"
DESCRIPTION = "The Qt 6 3DQuickInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt63DQuickInput6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dfbac90e905e3d14d359de25ee2d257741c6de721114e7010c0eb52c87e3fe17fb2319340c6373b18a1180889967077392fe24bf8e0e3440169b83641b5647e9"

RPROVIDES:${PN} += "libQt63DQuickInput.so.6 \
libQt63DQuickInput6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DInput.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
