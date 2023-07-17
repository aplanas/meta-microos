SUMMARY = "Qt 6 VirtualKeyboard library"
DESCRIPTION = "The Qt SVG module provides functionality for displaying SVG images \
as a widget, and to create SVG files using drawing commands."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6VirtualKeyboard6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "ff2f9478856e61f30112529cd8f7884269bc9e4c0e98b9fbb654a39e1ff9e675fabd4a84b9e6da22e526f347b4b03756df71f06e2f8e36c035dd06b8c0f826f1"

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
