SUMMARY = "PackageKit Backend for Discover"
DESCRIPTION = "A plugin for Discover to support management of system packages and repositories \
using PackageKit."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.7"

RPM_NAME = "discover-backend-packagekit-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "5590f2ee128d8807cad2f88538635207cc57084712086510f1efab593275518bb105eccd5f62ce402751b0bd424dac976fbe80d27cad2e9114f8e621b4a5e1fe"

RPROVIDES:${PN} += "discover-backend-packagekit"

RDEPENDS:${PN} += "AppStream \
PackageKit \
appstream-provider \
discover \
ld-linux-aarch64.so.1 \
libAppStreamQt.so.2 \
libDiscoverCommon.so \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5Service.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libpackagekitqt5.so.1 \
libstdc++.so.6"

inherit rpm
