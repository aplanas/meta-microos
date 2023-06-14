SUMMARY = "Calamares webview module"
DESCRIPTION = "Optional webview module for the Calamares installer."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.36"

RPM_NAME = "calamares-webview-3.2.36-1.20.aarch64.rpm"
RPM_HASH = "bae29aaaac0a044f37a5ab72323e09d0520adbedd175808233eb2d2d9a2d2a9c5891fee525918aec4000abd4181d6b69a3924b724b8b8a87c31a86eccf4de883"

RPROVIDES:${PN} += "calamares-webview \
libcalamares-viewmodule-webview.so"

RDEPENDS:${PN} += "calamares \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5WebEngine.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcalamares.so.3.2.36 \
libcalamaresui.so.3.2.36 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
