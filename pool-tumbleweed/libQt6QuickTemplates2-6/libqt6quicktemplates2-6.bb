SUMMARY = "Qt 6 QuickTemplates2 library"
DESCRIPTION = "The Qt 6 QuickTemplates2 library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6QuickTemplates2-6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a2c59282e3bd2a017a039c17d3bf0c4a61ab0d5b4b6a6ffa91bd81e2708c2134026457550c704f99902ef795f87093af4f0b7522c2e3067a93515372e8fc6f42"

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
