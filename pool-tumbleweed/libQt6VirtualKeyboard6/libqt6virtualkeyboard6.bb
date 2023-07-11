SUMMARY = "Qt 6 VirtualKeyboard library"
DESCRIPTION = "The Qt SVG module provides functionality for displaying SVG images \
as a widget, and to create SVG files using drawing commands."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6VirtualKeyboard6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "69a251ee121d3fab3b9a4ec4a035941451a94fe7c1b0d1fa7f006d95a3200553d73a558302de1c4ec0f1603493ae0e0069d2544b25b1233d3506862b8b335ecf"

RPROVIDES:${PN} += "libQt6VirtualKeyboard.so.6 \
libQt6VirtualKeyboard6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
