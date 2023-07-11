SUMMARY = "Removable Media Utility"
DESCRIPTION = "This utility allows you to manage removable media."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kwikdisk-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c20aac8e5030829f2e3e502ba616ef8dfd09315eef868d05c8c22b158cb8a41b9e929e513baf6323c10319dc6e82627e0656285c6dbbb9b6ee852e7370c9d928"

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
