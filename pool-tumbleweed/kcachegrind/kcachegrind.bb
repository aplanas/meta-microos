SUMMARY = "Frontend for Cachegrind"
DESCRIPTION = "KCachegrind is a frontend for cachegrind."
LICENSE = "GPL-2.0-only & BSD-4-Clause & GFDL-1.2-only"

PV = "23.04.3"

RPM_NAME = "kcachegrind-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e93da4398f80538b4e0cf4668cd53757eaf19bc26cf970bc64f7c6e7dd9d7b0a77abf6ca86311cf7cf970796df4660a9eb065849926a044d3ed091f527dc03df"

RPROVIDES:${PN} += "kcachegrind"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
