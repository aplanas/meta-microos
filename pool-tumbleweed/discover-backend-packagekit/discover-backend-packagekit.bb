SUMMARY = "PackageKit Backend for Discover"
DESCRIPTION = "A plugin for Discover to support management of system packages and repositories \
using PackageKit."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.6"

RPM_NAME = "discover-backend-packagekit-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "840aa7f125fa87190a9b7c9480c3f1b213093945e5d53506d2f3a28f467bde2857f8a8c37b72015358ce2895d242ae95a26ebfae4579caf5673cad706c9fd1d7"

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
