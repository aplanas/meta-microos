SUMMARY = "KDE Find File Utility"
DESCRIPTION = "KFind allows you to search for directories and files."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kfind-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "73d631d202475ef4fee77341ea21c6d0a7bebf25ad3712679c61fecfe6fe208357f011ad979ba9c4b08bd7ffb8c1b83928264800814b909ad4a72506cdb01342"

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
