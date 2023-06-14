SUMMARY = "KDE Archiver Tool"
DESCRIPTION = "This is a KDE application to work with compressed archives."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ark-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "62067421d4012fab03a43f02eeaa0bba44e030079a790baf79ebf0b749e80fce77c351b521a28bd63c93c18b99874c6bddd7f76f91e3d6431829148933ae163a"

RPROVIDES:${PN} += "ark"

RDEPENDS:${PN} += "/bin/sh \
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
