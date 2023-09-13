SUMMARY = "Introspection/Debugging Tool for Qt Applications"
DESCRIPTION = "Gamma Ray is a comprehensive collection of high level introspection \
and debugging utilities specifically tailored for the various \
frameworks in Qt."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "gammaray-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "b4d7993a80ab4d0692f497c4b9e5932853cf6f75055d97fbc9bdcb949efc9a5363fee0d239e0cfa7081d53ef89ec6da02c1d8281a5b3369a49985c2df4e03483"

RPROVIDES:${PN} += "gammaray"

RDEPENDS:${PN} += "gammaray-shared-plugins \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgammaray-client.so.3.0.0 \
libgammaray-common-qt5-15-aarch64.so.3.0.0 \
libgammaray-launcher-ui.so.3.0.0 \
libgammaray-launcher.so.3.0.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
