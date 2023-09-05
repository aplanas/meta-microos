SUMMARY = "Removable Media Utility"
DESCRIPTION = "This utility allows you to manage removable media."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kwikdisk-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "13ab6c44eb2c6a6f364682c9cc573ef027120c8729e3d90d09c0923fbb00defee6bb59e98aa3208362e2585eca173bb9dfe56e85ab8d69bd19b741925ede9e32"

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
