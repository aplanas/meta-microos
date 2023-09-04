SUMMARY = "Calamares webview module"
DESCRIPTION = "Optional webview module for the Calamares installer."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.62"

RPM_NAME = "calamares-webview-3.2.62-1.2.aarch64.rpm"
RPM_HASH = "1ba1c86474bd9e6c16b9d4f958c520dc6bdd0177c1f3c8f4a916dfd93a028aed7f6265d81bac5d09fcae600a04a67df170f21c0bff36824a0b14651316b61de4"

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
libcalamares.so.3.2.62 \
libcalamaresui.so.3.2.62 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
