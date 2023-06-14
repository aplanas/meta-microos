SUMMARY = "Frontend for Cachegrind"
DESCRIPTION = "KCachegrind is a frontend for cachegrind."
LICENSE = "GPL-2.0-only & BSD-4-Clause & GFDL-1.2-only"

PV = "23.04.1"

RPM_NAME = "kcachegrind-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "cd2b0e1addcd3564545cfd33b7967a5a5fd6ba56aaa5269826a45f695604d86311f02ff3da42257b6b582ffb30045a0e8f67da3dd5c200d56af6f502801f96e9"

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
