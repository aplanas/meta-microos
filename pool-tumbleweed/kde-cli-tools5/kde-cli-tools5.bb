SUMMARY = "Additional CLI tools for KDE applications"
DESCRIPTION = "Additional CLI tools for KDE applications and workspaces."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kde-cli-tools5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "c12f1beae530f799efc75e796e3b2c1695522059a33afaf9fc40b3fb699dcaea53888cf791a0d721aeaf144e4efdfcd6bdc15315548d57076d8d510069030f91"

RPROVIDES:${PN} += "kde-cli-tools5"

RDEPENDS:${PN} += "/bin/sh \
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
