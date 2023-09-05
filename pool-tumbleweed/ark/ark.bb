SUMMARY = "KDE Archiver Tool"
DESCRIPTION = "This is a KDE application to work with compressed archives."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "ark-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "bbfe6d5599fa46e97b78994cb671faa8b37ecf012cbe4b1f8d8973e2ccd75aaad4a27c9e1a0701f455b308f3398732a75b2589a42c8a3463e90f4239323fcf1b"

RPROVIDES:${PN} += "ark"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Parts.so.5 \
libKF5Service.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libarchive.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libkerfuffle.so.23 \
libstdc++.so.6 \
libz.so.1 \
libzip.so.5"

inherit rpm
