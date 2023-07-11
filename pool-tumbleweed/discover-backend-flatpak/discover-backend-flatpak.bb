SUMMARY = "Flatpak Backend for Discover"
DESCRIPTION = "A plugin for Discover to support installation and management of Flatpak \
applications and repositories."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.6"

RPM_NAME = "discover-backend-flatpak-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "41e7d2724a6acd3961c6c5742e80cecf1658de582f1ee697b5120c594c543af96d2bb0f1b94f96ee853526ab7b67513e9ca624d1e38820da47338260aaf9cf43"

RPROVIDES:${PN} += "discover-backend-flatpak"

RDEPENDS:${PN} += "discover \
flatpak \
ld-linux-aarch64.so.1 \
libAppStreamQt.so.2 \
libDiscoverCommon.so \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOGui.so.5 \
libKF5Service.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libflatpak.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libstdc++.so.6"

inherit rpm
