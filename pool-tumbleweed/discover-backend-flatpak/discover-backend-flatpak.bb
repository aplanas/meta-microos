SUMMARY = "Flatpak Backend for Discover"
DESCRIPTION = "A plugin for Discover to support installation and management of Flatpak \
applications and repositories."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.7"

RPM_NAME = "discover-backend-flatpak-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "271fe198f1386b0e45b71898556236443d9abf3e718fa26672780fab47668dea3954b9f097a2f1197c529409ca581da7a7ff94a8efd33d08f99a84b5b1d4e28e"

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
