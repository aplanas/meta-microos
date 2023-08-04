SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "kactivitymanagerd-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "b485cf2f628b2d10360d27ca7a12b9d619d7f8a41efc34e5ec869f91f1c7dc9c0f7408faa80cbeed0c7398f1df465d6a1106242974d1efbd33fe6174b12e4955"

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
