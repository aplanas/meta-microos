SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "kactivitymanagerd-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "fcdaee81b43376525b438ea31a93670394542c73da2a88416049cc4afb5528da2b8f11f61fbaa6818a1d11234c2fe21ac3e2c79e53ebdb48016f1708ebef0fc8"

RPROVIDES:${PN} += "kactivities4 \
kactivities5 \
kactivitymanagerd \
libkactivitymanagerd-plugin.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5GlobalAccel.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5Service.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
