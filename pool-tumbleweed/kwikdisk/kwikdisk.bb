SUMMARY = "Removable Media Utility"
DESCRIPTION = "This utility allows you to manage removable media."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kwikdisk-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5233510f738aa3f83550e99f1a4ec1112955404d1a10bb282e963353b41749c48294811c990b238aa5e42f7b41d36e400d77d77d5268919fe40a4c2a7f555bb7"

RPROVIDES:${PN} += "kwikdisk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkdfprivate.so.23 \
libstdc++.so.6"

inherit rpm
