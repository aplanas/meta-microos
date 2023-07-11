SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Kactivities provides an API for using and interacting with the Plasma Activities Manager."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "kactivitymanagerd-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "53a81900d42d627d365ee92159685c91132483985e9b71605e771de053af1436791e6abbaaea25709a8b17e3f45a7899ec771c42597cdaee4beddcfa363f2819"

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
