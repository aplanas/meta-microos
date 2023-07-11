SUMMARY = "Additional CLI tools for KDE applications"
DESCRIPTION = "Additional CLI tools for KDE applications and workspaces."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "kde-cli-tools5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "f96d70998f507a561ca27892b42cd56bc203336fc57e47d718ce3450661032ad5043716379682c891a5b878ba84703124910c98b874d97b206ff47f2566dccf9"

RPROVIDES:${PN} += "kde-cli-tools5"

RDEPENDS:${PN} += "/usr/bin/sh \
kdbusaddons-tools \
ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KCMUtils.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5Su.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libkworkspace5.so.5 \
libstdc++.so.6"

inherit rpm
