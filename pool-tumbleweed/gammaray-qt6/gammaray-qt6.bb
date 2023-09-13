SUMMARY = "Introspection/Debugging Tool for Qt Applications"
DESCRIPTION = "Gamma Ray is a comprehensive collection of high level introspection \
and debugging utilities specifically tailored for the various \
frameworks in Qt."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "gammaray-qt6-3.0.0-1.1.aarch64.rpm"
RPM_HASH = "b51ffa529cf3030edd99f638e3387b4efa55f7247835aabd60da29bfdeb360af3678e5f7255c9e520c99d5656df5b08ac7f8342553909b965796afdcb8890690"

RPROVIDES:${PN} += "gammaray-qt6"

RDEPENDS:${PN} += "gammaray-qt6-shared-plugins \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgammaray-client.so.3.0.0 \
libgammaray-common-qt6-5-aarch64.so.3.0.0 \
libgammaray-launcher-ui.so.3.0.0 \
libgammaray-launcher.so.3.0.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
