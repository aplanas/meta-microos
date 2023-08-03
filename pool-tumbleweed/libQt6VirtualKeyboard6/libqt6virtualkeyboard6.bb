SUMMARY = "Qt 6 VirtualKeyboard library"
DESCRIPTION = "The Qt SVG module provides functionality for displaying SVG images \
as a widget, and to create SVG files using drawing commands."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6VirtualKeyboard6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "42c581031d9bd738803e77432745e8ac8403df20e2006b2fd7bc02d222ab322de476231b825c47681c25a236df841e43645cc2de4c9d75fca2f0ffb363936a89"

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
