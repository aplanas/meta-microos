SUMMARY = "Flatpak Backend for Discover"
DESCRIPTION = "A plugin for Discover to support installation and management of Flatpak \
applications and repositories."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "discover-backend-flatpak-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "11e077bca9e6544a8712d94ae3635cb285f985f647fa46e7b013cf5c5b6551c4b3edf00996e4e61d40e89a0a55e318fa854e8be37a91cbcb8c0053a1887ecbd8"

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
