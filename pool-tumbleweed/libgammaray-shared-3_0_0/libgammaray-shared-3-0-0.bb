SUMMARY = "Shared Gammaray libraries used by either gammaray or gammaray-qt6"
DESCRIPTION = "This package provides libraries required by gammaray-shared-plugins"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "libgammaray-shared-3_0_0-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "2e0cdd6a7cbd354e03e01d673c11905079bd1e1450ebfa2c10dea1b320b825d529f01a8e6fb6434db622acef7f6b1a85d56c57d795265ded3ccabe9e8766d95c"

RPROVIDES:${PN} += "libgammaray-common-qt5-15-aarch64.so.3.0.0 \
libgammaray-core-qt5-15-aarch64.so.3.0.0 \
libgammaray-kitemmodels-qt5-15-aarch64.so.3.0.0 \
libgammaray-shared-3-0-0 \
libgammaray-ui-qt5-15-aarch64.so.3.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5SyntaxHighlighting.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdw.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
