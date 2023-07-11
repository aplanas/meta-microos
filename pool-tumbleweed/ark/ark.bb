SUMMARY = "KDE Archiver Tool"
DESCRIPTION = "This is a KDE application to work with compressed archives."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ark-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "1ae4e5668baaebd9e3014d68c0269b0dacbe5090115421fc767a1030a9264c992f03e1d675228404d69f233963a21583424f34a95afc61c9d349a0e7ea0301ff"

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
