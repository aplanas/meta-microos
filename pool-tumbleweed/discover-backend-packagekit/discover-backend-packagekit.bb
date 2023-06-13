SUMMARY = "PackageKit Backend for Discover"
DESCRIPTION = "A plugin for Discover to support management of system packages and repositories \
using PackageKit."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.5"

RPM_NAME = "discover-backend-packagekit-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "4264cec177a3f088ecf0745861ced184da89bfdd0a31c96d92cd7064e6f370d923969603a21f26be5e09a21ff4d5778c7228cc19f0167184f3e73dd70a8bae2c"

RPROVIDES:${PN} += "discover-backend-packagekit \
discover-backend-packagekit(aarch-64) \
metainfo() \
metainfo(org.kde.discover.packagekit.appdata.xml)"

RDEPENDS:${PN} += "AppStream \
PackageKit \
appstream-provider \
discover \
ld-linux-aarch64.so.1()(64bit) \
libAppStreamQt.so.2()(64bit) \
libDiscoverCommon.so()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libpackagekitqt5.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
