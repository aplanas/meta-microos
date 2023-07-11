SUMMARY = "KDE Find File Utility"
DESCRIPTION = "KFind allows you to search for directories and files."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kfind-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "11e8fc154140a505e7c5b00901f23cbfc8a53343a4880bca4a026374ff1e110fb2a40c70152afbef7c99d2a6e55e96bf8ddf72f00ed259a3b64bd82c787c8b72"

RPROVIDES:${PN} += "kfind"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
