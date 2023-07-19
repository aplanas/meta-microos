SUMMARY = "Calamares webview module"
DESCRIPTION = "Optional webview module for the Calamares installer."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.62"

RPM_NAME = "calamares-webview-3.2.62-1.1.aarch64.rpm"
RPM_HASH = "88477d0603481fa4c53355fec8682ffac92835722eb8c851c12ccddd80570bdea9c5e89dded3c209ab853b100348159aa86a85bdd4d101fd78b23185eaecae07"

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
