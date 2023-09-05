SUMMARY = "Google Drive KIO slave for KDE applications"
DESCRIPTION = "Google Drive KIO slave for KDE applications. \
KIO GDrive requires a KIO-enabled file manager at runtime, \
otherwise there is no way to setup a Google Drive account. \
This can be Dolphin or Gwenview or Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kio-gdrive-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "11439cd609a9119e8fc07c3de69247d18611148fc5536032654d3eccdb8b539872ffc1879dfd65d1053be8e711f4a5cec0fbb6faefa16943a90c4cf8194f6111"

RPROVIDES:${PN} += "kio-gdrive"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKPim5GAPICore.so.5 \
libKPim5GAPICore5 \
libKPim5GAPIDrive.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libaccounts-qt5.so.1 \
libc.so.6 \
libkaccounts.so.2 \
libstdc++.so.6"

inherit rpm
