SUMMARY = "Gammaray libraries"
DESCRIPTION = "Gammaray libraries."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "libgammaray-qt6-3_0_0-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "bb8323924b34c27df04563f8e6907ef3392a5309c357442ea47917e6e69a5b10c80e4dbe745a32f66ceef6bad39c61015f86c4755536ded0e5cd6c0fbaf492f2"

RPROVIDES:${PN} += "libgammaray-client.so.3.0.0 \
libgammaray-kuserfeedback.so.3.0.0 \
libgammaray-launcher-ui.so.3.0.0 \
libgammaray-launcher.so.3.0.0 \
libgammaray-qt6-3-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgammaray-common-qt6-5-aarch64.so.3.0.0 \
libgammaray-kitemmodels-qt6-5-aarch64.so.3.0.0 \
libgammaray-ui-qt6-5-aarch64.so.3.0.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
