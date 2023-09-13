SUMMARY = "Gammaray libraries"
DESCRIPTION = "Gammaray libraries."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "libgammaray-3_0_0-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "52cdf087161402aafeacc66126869f79fcce367e6aed652e2c1a77ee5c1de8db600af508395c100850cbb203b2d8e12685a7f169f652f2411147e4fe6b570c36"

RPROVIDES:${PN} += "libgammaray-3-0-0 \
libgammaray-client.so.3.0.0 \
libgammaray-kuserfeedback.so.3.0.0 \
libgammaray-launcher-ui.so.3.0.0 \
libgammaray-launcher.so.3.0.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgammaray-common-qt5-15-aarch64.so.3.0.0 \
libgammaray-kitemmodels-qt5-15-aarch64.so.3.0.0 \
libgammaray-ui-qt5-15-aarch64.so.3.0.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
