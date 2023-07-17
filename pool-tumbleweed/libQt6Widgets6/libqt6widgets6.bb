SUMMARY = "Qt 6 Widgets library"
DESCRIPTION = "The Qt Widgets library provides a set of UI elements to create classic \
desktop-style user interfaces."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6Widgets6-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "5ee263ae21756235d2e8055377747827eeeb0e877bf9f1393914732e678c05b5cd8e591c0f510aae8cc5d5bb118ff54da60c60fa3951d28c600901842a56a25e"

RPROVIDES:${PN} += "libQt6Widgets.so.6 \
libQt6Widgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Gui6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
